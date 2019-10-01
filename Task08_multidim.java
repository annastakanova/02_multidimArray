package com.epam;
//Дан двухмерный массив n×m элементов.
// Определить, сколько раз встречается число 7 среди элементов массива

public class Task08_multidim {
    public static void main(String[] args) {
        int[][] matrix = {{85, -14, 7, 45, 7}, {-45, 7, -13, 28, 11}, {18, -7, 84, 27, 7}, {7, -63, 74, 15, 16}, {-12, 53, 74, 27, 77}};
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 7)
                    count ++;
            }
        }
        System.out.print("число 7 встречается " + count + " раз");
    }
}
