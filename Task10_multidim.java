package com.epam;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

//Приняла, что строки и столбцы начинаются с 1го номера:

public class Task10_multidim {
    public static void main(String[] args) {
        int[][] matrix = {
                {85, -14, 7, 45, 7},
                {-45, 7, -13, 28, 11},
                {18, -7, 84, 27, 7},
                {7, -63, 74, 15, 16},
                {-12, 53, 74, 27, 77}
        };
        int k = 2;
        int p = 3;

            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[k-1][j] + "  ");
            }
            System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(matrix[i][p-1] + "  ");
        }
    }
}
