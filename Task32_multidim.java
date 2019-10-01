package com.epam;
//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.


public class Task32_multidim {
    public static void main(String[] args) {
        int arr[][] = {{1, 9, 7, 4, 2}, {6, 7, 2, 5, 6}, {8, 3, 9, 1, 4}, {1, 8, 2, 4, 5}};

        System.out.println("строки отсортированы по убыванию: ");
        sortLineA(arr);

        System.out.println("строки отсортированы по возрастанию: ");
        sortLineB(arr);

    }

    public static void sortA(int[] arr) {
        for (int z = arr.length - 1; z > 0; z--) {
            for (int i = 0; i < z; i++) {
                if (arr[i] < arr[i + 1]) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void sortLineA(int[][] arr) {
        for (int LineA[] : arr)
            sortA(LineA);
    }


    public static void sortB(int[] arr) {
        for (int z = arr.length - 1; z > 0; z--) {
            for (int i = 0; i < z; i++) {
                if (arr[i] > arr[i + 1]) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void sortLineB(int[][] arr) {
        for (int LineB[] : arr)
            sortB(LineB);
    }
}

        /*int[][] arr = {{10, 7, 4, 2}, {8, 3, 9, 11}};
        if (arr.length == 0)
            System.out.println("Исходный массив имеет нулевую длину");

        System.out.println("Исходный массив:" + Arrays.toString(arr));

        for (int a = arr.length - 1; a >= 1; a--) {
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a; j++) {
                        if (arr[i][j] > arr[i][j + 1]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[i][j + 1];
                            arr[i][j + 1] = temp;
                        }
                    }
                }
        }

        for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (i == j) {
                        System.out.print(arr[i][j] + "   ");
                    }
                }
                System.out.println();
        }*/

