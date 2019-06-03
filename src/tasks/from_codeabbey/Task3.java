package tasks.from_codeabbey;

import java.util.Arrays;

public class Task3 {

    public static void calculate_3() {

        int[] arr1 = {25, 35, 45};
        int[] arr2 = {45, 100, 5};
        int[] arr3 = new int[3];


        for (int i = 0; i < arr3.length; i++) {

            arr3[i]=arr1[i]+arr2[i];
                    }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3));

        }

    }
}