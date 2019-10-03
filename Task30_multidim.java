package com.epam;
//Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз

public class Task30_multidim {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int [][] matrix = new int [m][n];
        int [] res = new int [10];
        int a = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100 % 15);
                System.out.printf("%4d",matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("число 5 встречается три и более раз в строках номер: ");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5)
                    count++;
            }
            if (count > 2)
                System.out.print(i + "\t");
        }
        System.out.println();
    }
}
