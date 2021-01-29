package com.wen.array;

import java.util.Arrays;

public class CreateArr {
    public static int[] createArr(int[] array) {
        array[0] = (int) (Math.random() * 100 + 1);
        array[1] = (int) (Math.random() * 100 + 1);
        array[2] = (int) (Math.random() * 100 + 1);
        array[3] = (int) (Math.random() * 100 + 1);
        array[4] = (int) (Math.random() * 100 + 1);
        return array;
    }
}
