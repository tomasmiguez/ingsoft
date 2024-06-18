package inge2.dataflow;

import org.apache.commons.io.IOUtils;

import java.nio.charset.Charset;

public class JMLRunner {

    private final String jmlExecutablePath;
    private final String projectSourcesDir;

    public JMLRunner() {
        jmlExecutablePath = getJMLExecutablePath();
        projectSourcesDir = System.getProperty("srcDir");
    }

    /**
     * Hace el análisis estático de la clase targetClassName.
     * @param targetClassName
     * @return
     */
    public JMLResult check(String targetClassName) {
        String sourceFilePath = String.format("%s/%s.java",
                projectSourcesDir,
                targetClassName.replace(".", "/"));

        return runJML(
            new String[] {
                "--esc",
            },
            new String[] {sourceFilePath}
        );
    }

    /**
     * Ejecuta OpenJML con los parámetros y archivos fuente especificados.
     * @param options
     * @param sourceFiles
     * @return
     */
    public JMLResult runJML(String[] options, String[] sourceFiles) {
        // Arma el comando a ejecutar
        String[] command = new String[options.length + sourceFiles.length + 1];
        command[0] = jmlExecutablePath;
        System.arraycopy(options, 0, command, 1, options.length);
        System.arraycopy(sourceFiles, 0, command, options.length + 1, sourceFiles.length);

        try {
            Process p = new ProcessBuilder(command).start();
            String stderr = IOUtils.toString(p.getErrorStream(), Charset.defaultCharset());
            String stdout = IOUtils.toString(p.getInputStream(), Charset.defaultCharset());

            return new JMLResult(stdout, stderr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Devuelve la ruta al ejecutable de OpenJML.
     * @return
     */
    private String getJMLExecutablePath() {
        String jmlFolderPath = System.getProperty("jmlFolderPath");
        if (!new java.io.File(jmlFolderPath).exists()) {
            throw new RuntimeException("No se encontró la carpeta de OpenJML. Ejecutar \"setup.sh\"");
        }

        String executablePath = jmlFolderPath + "/openjml";
        if (!new java.io.File(executablePath).exists()) {
            throw new RuntimeException("No se encontró el ejecutable de OpenJML. Ejecutar \"setup.sh\"");
        }

        return executablePath;
    }
}
