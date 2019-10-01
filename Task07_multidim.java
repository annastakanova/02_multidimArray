package com.epam;
//Дан двумерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов

public class Task07_multidim {
    public static void main(String[] args) {
        int[][] matrix = {{85, -14, 62, 45, 34}, {-45, 34, -13, 28, 11}, {18, -83, 84, 27, -76}, {15, -63, 74, 15, 16}, {-12, 53, 74, 27, 77}};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j % 2 != 0 && matrix[i][j] < 0)
                    sum += Math.abs(matrix[i][j]);
            }
        }
        System.out.print("sum = " + sum);
    }
}