package com.epam;
//Сформировать матрицу из чисел от 0 до 999, вывести ее на экран.
// Посчитать количество двузначных чисел в ней

public class Task31_multidim {
    public static void main(String[] args) {
        int a = 0;
        int count = 0;
        int arr[][] = new int[40][25];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = a;
                if (arr[i][j] > 9 && arr[i][j] < 100) {
                    count ++;
                }
                a++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nКоличество двузначных чисел = " + count);
    }
}