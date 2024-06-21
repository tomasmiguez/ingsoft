package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    //@ ensures \result <==> (\exists int i; 0 <= i < arr.length; arr[i] == elem);
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;

        /*@ maintaining 0 <= i <= arr.length;
            maintaining result <==> (\exists int j; 0 <= j < i; arr[j] == elem);
            loop_writes result;
            loop_writes i;
            decreases arr.length - i;
         @*/
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                result = true;
            }
        }

        return result;
    }
}