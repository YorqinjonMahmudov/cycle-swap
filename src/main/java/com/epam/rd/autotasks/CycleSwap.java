package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int[] ints;
        if (array.length > 1) {


            int temp = array[array.length-1];

            for (int j = array.length - 1; j > 0; j--)
                array[j] = array[j - 1];

            array[0] = temp;
        }

    }

    
    static void cycleSwap(int[] array, int shift) {
        int len = array.length;

        int[] ints = new int[array.length];


        for (int i = 0; i < len; i++)
            ints[(i + shift) % len] = array[i];

                System.arraycopy(ints, 0, array, 0, len);    
                }

}
