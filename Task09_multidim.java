package com.epam;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Task09_multidim {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = {{85, -14, 7, 45, 7}, {-45, 7, -13, 28, 11}, {18, -7, 84, 27, 7}, {7, -63, 74, 15, 16}, {-12, 53, 74, 27, 77}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
}