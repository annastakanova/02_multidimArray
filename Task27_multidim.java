package com.epam;
//В числовой матрице поменять местами два столбца любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый.
// Номера столбцов вводит пользователь с клавиатуры.
import java.util.Scanner;

public class Task27_multidim {
    public static void main(String[] args) {
        int s1 = 0;
        int s2 = 0;
        int[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, };

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи номер первого столбца");
        s1 = Integer.parseInt(sc.next());
        System.out.println("Введи номер второго столбца");
        s2 = Integer.parseInt(sc.next());

        change(s1, s2, array);
        for (int[] k1 : array) {
            for(int s : k1) {
                System.out.printf("%3d ", s);
            }
            System.out.println("");
        }
    }

    public static int[][] change(int first, int second,int[][] array) {
        for(int i = 0; i < array.length; i++) {
            if (first > array[i].length || second > array[i].length) {
                System.out.println("Введенный номер за пределами размеров матрицы");
                break;
            }
        }
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            b = array[i][first - 1];
            array[i][first - 1] = array[i][second - 1];
            array[i][second - 1] = b;
        }
        return array;
    }
}
