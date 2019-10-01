package com.epam;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task18_multidim {
    public static void main(String[] args) {
            int n = 5;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n-i)
                        matrix[i][j] = i+1;
                    else matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + "   ");
                }
                System.out.println();
            }
    }
}
