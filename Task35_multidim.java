package com.epam;
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

//что отзначает нечетность??

public class Task35_multidim {
    public static void main(String[] args) {
        int[][] matrix = {
                {40, 14, 17, 45, 17, 71},
                {45, 15, 13, 28, 11, 24},
                {18, 17, 18, 27, 12, 23},
                {17, 63, 74, 15, 16, 54},
                {12, 53, 74, 27, 18, 13}};
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.print("наибольший элемент матрицы = " + max +"\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i%2 == 1 && j%2 == 1)
                    matrix[i][j] = max;
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
