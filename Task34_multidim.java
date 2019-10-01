package com.epam;
//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца

public class Task34_multidim {
    public static void main(String[] args) {
        int m = 8, n = 5;
        if (n>m)
            System.out.println("количество единиц больше количествa номеров столбцов");
        if (m <= 1 || n <= 1)
            System.out.println("количество должно быть больше единицы");
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i){
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j] + "   ");
                }
                else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
}
