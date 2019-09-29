package com.epam;
//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами

public class Task05_multidim {
    public static void main(String[] args) {
        int[][] matrix = { {85, 14, 62, 45}, {45, 34, 13, 28}, {18, 83, 84, 27}, {85, 74, 15, 16}, {12, 53, 74, 27}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i%2 == 0)
                    System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
