package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    //@ TODO: ESPECIFICAR
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                result = true;
            }
        }

        return result;
    }
}