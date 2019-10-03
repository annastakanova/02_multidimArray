package com.epam;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task21_multidim {
    public static void main(String[] args) {
        int n = 8;
        if(n < 1)System.out.println("отрицательное число, не подходит по условию  ");
        else if(n % 2 == 1) System.out.println("нечетное число, не подходит по условию  ");

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = n - (i - j);
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
