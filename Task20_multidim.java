package com.epam;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task20_multidim {
    public static void main(String[] args) {
        int n = 10;
        if (n%2 ==1) System.out.println("n нечетное");

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i && j < n - i - 1 || j < i && i > n - j - 1)
                    matrix[i][j] = 0;
                else matrix[i][j] = 1;
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}