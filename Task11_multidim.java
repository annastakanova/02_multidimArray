package com.epam;
//Дана матрица размера m x n.
// Вывести ее элементы в следующем порядке: первая строка справа налево,
// вторая строка слева направо, третья строка справа налево и так далее

public class Task11_multidim {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] matrix = {{85, -14, 7, 45, 7}, {-45, 7, -13, 28, 11}, {18, -7, 84, 27, 7}, {7, -63, 74, 15, 16}, {-12, 53, 74, 27, 77}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2 == 1)
                    System.out.print (matrix[i][j] + "   ");
                else if (i%2 == 0)
                    System.out.print(matrix[i][n-j-1] + "   ");
            }
            System.out.println();
        }
    }
}
