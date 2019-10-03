package com.epam;
//Получить квадратную матрицу порядка n

public class Task25_multidim {
        public static void main(String[] args) {
            int n = 8;
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = n*i + (j+1);
                    System.out.printf("%5d", matrix[i][j]);
                }
                System.out.println();
        }
    }
}