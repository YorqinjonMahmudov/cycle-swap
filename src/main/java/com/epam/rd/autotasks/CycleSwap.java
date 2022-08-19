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

        int[] ints = new int[array.length];
        if(shift > array.length)
            return;
        int sub = shift;
        for (int i = 0; i < shift; i++) {
            ints[i] = array[array.length-(sub)];
            sub--;
        }


        int a = array.length-1;
        for (int i = array.length-shift-1; i >= 0; i--) {
            array[a] = array[i];
            a--;
        }

        for (int i = 0; i < shift; i++)
            array[i] = ints[i];

    }

}
