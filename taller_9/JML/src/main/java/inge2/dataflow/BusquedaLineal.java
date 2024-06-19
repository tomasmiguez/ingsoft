package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    //@ requires arr != null & 0 <= arr.length < Integer.MAX_VALUE;
    //@ requires elem > Integer.MIN_VALUE;
    //@ ensures \result <==> (\exists int i; 0 <= i < arr.length; arr[i] == elem);
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;

        //@ maintaining 0 <= i <= arr.length;
        //@ maintaining result <==> (\exists int j; 0 <= j < i; arr[j] == elem);
        //@ decreases arr.length - i;
        //@ loop_writes result;
        //@ loop_writes i;
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                result = true;
            }
        }
        //@ assert result <==> (\exists int j; 0 <= j < arr.length; arr[j] == elem);

        return result;
    }
}