package com.epam;
//Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task28_multidim {
    public static void main(String[] args) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            int m = 6;
            int n = 7;
            int[][] matrix;
            System.out.println("Исходная матрица:");
            matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

            int maxColumn = 1;
            int maxSum = 0;
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][j];
                }
                System.out.println("сумма элементов в столбце "+ (j + 1) + ":  " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxColumn = j + 1;
                }
                sum = 0;
            }
            System.out.printf("\nмаксимальную сумму содержит столбец " + maxColumn);
    }
}
