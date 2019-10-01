package com.epam;
//Найти положительные элементы главной диагонали квадратной матрицы

public class Task29_multidim {
    public static void main(String[] args) {
        int[][] matrix = {
                {40, 14, 17, 45, 17, 71},
                {45, 15, 13, 28, 11, 24},
                {18, 17, -18, 27, 12, 23},
                {17, 63, 74, -15, 16, 54},
                {12, 53, 74, 27, 18, 13},
                {34, 13, 28, 45, 19, 55},
        };
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i]>0)
                System.out.println(matrix[i][i]);

        }
    }
}
