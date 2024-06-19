package inge2.dataflow;

public class MapSumaUno {

    // Suma uno a todos los elementos de un array.
    //
    /*@ requires \forall int i; 0 <= i < arr.length; arr[i] <= Integer.MAX_VALUE - 1;
        ensures \forall int i; 0 <= i < arr.length; \old(arr[i]) + 1 == arr[i];
    @*/
    public static void mapSumaUno(int[] arr) {
        /*@ maintaining 0 <= i <= arr.length;
            maintaining \forall int j; 0 <= j < i; \old(arr[j]) + 1 == arr[j];
            maintaining \forall int j; i <= j < arr.length; \old(arr[j]) == arr[j];
            loop_writes i, arr[i];
            decreases arr.length - i;
        @*/
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}