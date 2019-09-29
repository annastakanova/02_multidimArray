package com.epam;
//Дана матрица. Вывести на экран первый и последний столбцы

public class Task03_multidim {
    public static void main(String[] args) {
        int m = 5;   //кол-во строк
        int n = 6;   //кол-во столбцов
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 9);
                if (j == 0 || j == n-1)
                    System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
