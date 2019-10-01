package com.epam;
//Сформировать квадратную матрицу порядка N по правилу A[I,J] = sin ((I^2-J^2)/N)
// и подсчитать количество положительных элементов в ней.

public class Task23_multidim {
    public static void main(String[] args) {
        int n = 4;
        double[][] matrix = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((i*i - j*j)/n);
                System.out.printf("%.16f     ", matrix[i][j]);
                if (matrix[i][j]>0)
                    count++;
            }
            System.out.println();
        }
    }
}

