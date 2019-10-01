package com.epam;
//Переставить строки матрицы случайным образом

public class Task37_multidim {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] arr = {
                {40, 14, 17, 45, 17, 71},
                {45, 15, 13, 28, 11, 24},
                {18, 17, 18, 27, 12, 23},
                {17, 63, 74, 15, 16, 54},
                {12, 53, 74, 27, 18, 13}};

        int tmp1[]=arr[0];
        arr[0] = arr[1];
        arr[1] = tmp1;

        int tmp2[]=arr[2];
        arr[2] = arr[4];
        arr[4] = tmp2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
