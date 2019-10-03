package com.epam;
//Операция сглаживания матрицы дает новую матрицу того же размера,
//// каждый элемент которой получается
//// как среднее арифметическое соседей соответствующего элемента исходной матрицы.
//// Построить результат сглаживания заданной матрицы
public class Task36_multidim {
    public static void main(String[] args) {
        int[][] arr = {
                {40, 14, 17, 45, 17, 71},
                {45, 15, 13, 28, 11, 24},
                {18, 17, 18, 27, 12, 23},
                {17, 63, 74, 15, 16, 54},
                {12, 53, 74, 27, 18, 13},
                {12, 53, 74, 27, 18, 13}
        };
        double[][] arrRes = new double [arr.length][arr[0].length];

        for (int i = 0; i < arrRes.length; i++) {
            for (int j = 0; j < arrRes.length; j++) {
                if (j == 0 || j == arrRes[0].length - 1) {
                    arrRes[i][j] = arr[i][j];
                } else {
                    arrRes[i][j] = 0.5 * (arr[i][j - 1] + arr[i][j + 1]);
                }
            }
        }


        for (int i = 0; i < arrRes.length; i++){
            for (int j = 0; j < arrRes[i].length; j++){
                System.out.print(arrRes[i][j] + "\t");
            }
            System.out.println();
        }
    }
}