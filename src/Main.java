//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // задача 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        float[] arrF = {1.57f, 7.654f, 9.986f};
        int[] arrP = {1, 2, 3, 4, 3, 2, 5, 6, 7, 8, 9, 4, 5, 6};

        //задача 2
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arrF.length; i++) {
            if (i == arrF.length - 1) {
                System.out.println(arrF[i]);
                break;
            }
            System.out.print(arrF[i] + ", ");
        }
        for (int i = 0; i < arrP.length; i++) {
            if (i == arrP.length - 1) {
                System.out.println(arrP[i]);
                break;
            }
            System.out.print(arrP[i] + ", ");
        }

        // задача 3
        for (int i = arr.length - 1; i > -1; i = i - 1) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = arrF.length - 1; i > -1; i = i - 1) {
            if (i == 0) {
                System.out.println(arrF[i]);
                break;
            }
            System.out.print(arrF[i] + ", ");
        }
        for (int i = arrP.length - 1; i > -1; i = i - 1) {
            if (i == 0) {
                System.out.println(arrP[i]);
                break;
            }
            System.out.print(arrP[i] + ", ");
        }

        // Задача 4
        for (int i = arr.length - 1; i > -1; i = i - 1) {
            if (!(arr[i] % 2 == 0)) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}