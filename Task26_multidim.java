package com.epam;
//С клавиатуры вводится двумерный массив чисел размерностью nxm.
// Выполнить с массивом следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.


import java.util.Arrays;
import java.util.Scanner;

public class Task26_multidim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        System.out.println("Введите n:");
        int n = sc.nextInt();
        System.out.println("Введите m:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Введите элемент [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }

        }
        sc.close();

        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
        }

        System.out.println("\nCуммы отрицательных элементов в строках;");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    sum = sum + arr[i][j];
                }
                if (j == arr[0].length - 1) {
                    System.out.println("Cтрока " + i + " = " +sum);
                }
            }
        }

        System.out.println("\nМаксимальные элементы в строках:");
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (j == arr[0].length - 1) {
                    System.out.printf("Cтрока " + i + "= " +max+ "\n");
                }
            }

        }

        System.out.println("\nМассив после перестановок:");
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("\nmax = " + max);
        System.out.println("min = " + min + "\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == max) {
                    arr[i][j] = min;
                } else if (arr[i][j] == min) {
                    arr[i][j] = max;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
        }
    }
}
