package com.epam;
//Дана матрица.
//Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
//(приняла, что столбцы начинаются с четного 0-го)

public class Task06_multidim {
    public static void main(String[] args) {
        int[][] matrix = { {85, 14, 62, 45},
                           {45, 34, 13, 28},
                           {18, 83, 84, 27},
                           {15, 74, 15, 16}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j%2 == 1 /*&& matrix[0][j] > matrix[4][j])*/) {
                    System.out.print(matrix[i][j] + "  ");
                    //else return;
                }
            }
            System.out.println();
        }
    }
}