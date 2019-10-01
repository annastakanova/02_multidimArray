package com.epam;
//Найдите сумму двух матриц

public class Task38_multidim {
    public static void main(String[] args) {
        int[][][] matrix1 = {
                {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}
        };
        int[][][] matrix2 = {
                {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}},
                {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}},
                {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}
        };
        if (matrix1.length != matrix2.length)
            System.out.println("Данные матрицы имеют неподходящую размерность");

        int[][][] matrixSum = new int [3][3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    matrixSum[i][j][k] = matrix1[i][j][k] + matrix2[i][j][k];
                    System.out.print(matrixSum[i][j][k] + "   ");
                }
                System.out.print("     ");
            }
            System.out.println();
        }
    }
}