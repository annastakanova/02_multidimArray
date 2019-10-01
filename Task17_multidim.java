package com.epam;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)


//не решено
public class Task17_multidim {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if (i==0 || i == n-1 || j == 0 || j == n-1)
                    matrix[i][j] = 1;
               else matrix[i][j] = 0;
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
