package com.epam;
//Найдите произведение двух матриц

public class Task39_multidim {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}};
        int[][] array2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int[][] multArray = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2[0].length; j++){
                for (int x = 0; x < array2.length; x++){
                    multArray[i][j] += array1[i][x] * array2[x][j];
                }
            }
        }

        for (int i = 0; i < multArray.length; i++) {
            for (int j = 0; j < multArray[0].length; j++) {
                System.out.print(multArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
