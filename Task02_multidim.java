package com.epam;
//Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]

public class Task02_multidim {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random()*9);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
