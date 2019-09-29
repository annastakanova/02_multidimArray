//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так,
// чтобы в одной строке была ровно одна единица, и вывести на экран.

package com.epam;
import java.util.Arrays;


public class Task01_multidim {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) matrix[i][j] = 1;
                else matrix[i][j] = 0;
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
