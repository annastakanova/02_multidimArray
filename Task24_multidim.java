package com.epam;
// Дан линейный массив x1,x2,...,xn−1,xn
// Получить действительную квадратную матрицу порядка n

public class Task24_multidim {
    public static void main(String[] args) {
        double [] array = {5.0, 4.8, 7.6, 3.9, 7.1};
        int n = 5;
        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            int j = 0;
            matrix[i][j] = array[i];
            System.out.printf("%15.5f", matrix[i][j]);
        }
        System.out.println(" ");

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]= Math.pow(array[j], i+1);
                System.out.printf("%15.5f", matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}
