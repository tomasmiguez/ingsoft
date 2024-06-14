package inge2.dataflow.pointstoanalysis;

import soot.Unit;
import soot.jimple.AssignStmt;
import soot.tagkit.LineNumberTag;

import java.util.*;

public class PointsToGraph {

    /**
     * Nodos del grafo.
     *
     * Cada nodo representa todos los objetos creados por cada sentencia "new".
     * Es decir, tenemos un nodo por cada "new" en el programa.
     */
    public Set<String> nodes;

    /**
     * Ejes del grafo.
     *
     * Un eje (n1, f, n2) indica que el los objetos representados por el nodo n1 tienen un campo f que apunta al/los
     * objetos representados por n2.
     */
    public Set<Axis> axis;

    /**
     * Mapping de variables locales a nodos.
     * Representa el conjunto de objetos a los que puede apuntar una variable local.
     */
    public Map<String, Set<String>> mapping;

    public PointsToGraph(){
        nodes = new HashSet<>();
        axis = new HashSet<>();
        mapping = new HashMap<>();
    }

    public void clear() {
        nodes.clear();
        axis.clear();
        mapping.clear();
    }

    /**
     * Devuelve el nombre del nodo correspondiente a la sentencia <code>stmt</code>.
     * @param stmt
     * @return
     */
    public String getNodeName(AssignStmt stmt) {
        LineNumberTag lineNumberTag = (LineNumberTag) stmt.getTag("LineNumberTag");
        return String.valueOf(lineNumberTag.getLineNumber());
    }

    /**
     * Devuelve el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     * @param variableName
     * @return
     */
    public Set<String> getNodesForVariable(String variableName) {
        return mapping.get(variableName);
    }

    /**
     * Setea el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     * @param variableName
     * @param nodes
     */
    public void setNodesForVariable(String variableName, Set<String> nodes) {
        mapping.put(variableName, nodes);
    }

    /**
     * Agrega un eje al grafo.
     * @param leftNode
     * @param fieldName
     * @param rightNode
     */
    public void addEdge(String leftNode, String fieldName, String rightNode) {
        axis.add(new Axis(leftNode, fieldName, rightNode));
    }

    /**
     * Devuelve el conjunto de nodos alcanzables desde el nodo <code>node</code> por el campo <code>fieldName</code>.
     * @param node
     * @param fieldName
     * @return
     */
    public Set<String> getReachableNodesByField(String node, String fieldName) {
        Set<String> matchingNodes = new HashSet<>();

        for (Axis edge : axis) {
            if (edge.leftNode.equals(node) && edge.fieldName.equals(fieldName)) {
                matchingNodes.add(edge.rightNode);
            }
        }

        return matchingNodes;
    }

    /**
     * Copia de un grafo (modifica el this).
     * @param in
     */
    public void copy(PointsToGraph in) {
        this.clear();
        in.putAll(this);
    }

    /**
     * Union de dos grafos (modifica el this).
     * this = this U in
     * @param in el grafo a unir
     */
    public void union(PointsToGraph in) {
        nodes.addAll(in.nodes);
        axis.addAll(in.axis);
        mapping.putAll(in.mapping);
    }

    /**
     * Metodo privado para agregar toda la información de este grafo al grafo dst.
     * @param dst el grafo destino.
     */
    private void putAll(PointsToGraph dst) {
        dst.union(this);
    }
}
