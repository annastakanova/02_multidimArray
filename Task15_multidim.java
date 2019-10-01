package com.epam;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task15_multidim {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    matrix[i][j] = n-i;
                else matrix[i][j] = 0;
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
