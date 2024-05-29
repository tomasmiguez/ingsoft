### 1)
Para responder esta pregunta ejecutamos el comando
```bash
./gradlew soot -PtargetClass=com.example.Foo -Panalysis=jap.rdtagger
```
obteniendo como resultado el archivo `sootOutput/com.example.Foo.jimple`.

#### a)
En dicho archivo se puede ver que las reaching definitions de `return c;` son
las dos ramas del condicional previo. Esto es razonable, ya que el estado de `c` se
ve alterado en ambas, y no hay ninguna otra asignación anterior al return.

#### b)
Por otro lado, las reaching definitions de `System.out.println(rv);` son la
asignación a `rv` en la línea anterior, y la instanciación de `System.out` de la
misma línea, que fue pusheada en el stack y accedida de forma consecutiva.

---

### 2)
Para las respuestas de este ejercicio primero ejecutamos
```bash
./gradlew soot -PtargetClass=com.example.ReachingDefinitionsExample -Panalysis=jap.rdtagger
```
con lo que generamos el archivo
`sootOutput/com.example.ReachingDefinitionsExample.jimple`.

#### a)
La línea `a = c - a;` es alcanzable por las definiciones `c = 1`, `c = c +
2`, `a = 8` y `a = 5`. Las de `a` son evidentes, ya que dependiendo del largo de
`args` uno u otro valor serán usados en este punto. En el caso de `c`, suena
extraño que su valor pueda provenir de `c = 1` ya que con los posibles valores
de `a` y el valor inicial de `c`, siempre deberíamos entrar al while al menos
una vez, pero recordemos que en análisis estático asumimos que cualquier lado de un
branch puede ocurrir sin análisis más profundo.

#### b)
Para `return a;` es claro que la única definición que la alcanza es la
inmediatamente anterior (`a = c - a`), ya que la única variable involucrada es
`a`, que se redefine inmediatamente antes sin saltos condicionales ni nada de
por medio.

---

### 3)
En este ejercicio tuvimos que ejecutar
```bash
./gradlew soot -PtargetClass=com.example.LiveVariablesExample -Panalysis=jap.lvtagger
```
lo que generó el archivo `sootOutput/com.example.LiveVariablesExample.jimple`.

Luego simplemente parseamos los comentarios de ese archivo en el formato que
pide la consigna.

| Sentencia   | a  | b  | c  | d  | r  |
|-------------|----|----|----|----|----|
| d = a - b ; | SI | SI | SI | NO | NO |
| r = c;      | NO | NO | NO | NO | SI |
| r = d;      | NO | NO | NO | SI | NO |
| return r;   | NO | NO | NO | NO | NO |

