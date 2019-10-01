package com.epam;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task13_multidim {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2 == 0)
                    matrix[i][j] = j+1;
                else if (i%2 == 1)
                    matrix[i][j] = n-j;
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
