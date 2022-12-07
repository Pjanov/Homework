package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2(5);
        task3(9);
        task4("Привет!", 3);

        int array1[] = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        task6(array1);

        int array2[] = new int[100];
        task7(array2);

        int array3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        task8(array3);

        task9(8);
        task10(10, 15);
    }

    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len,
     * каждая ячейка которого равна initialValue;
     */
    private static void task10(int len, int initialValue) {
        int array[] = new int[len];
        for (int index = 0; index < array.length; index++) {
            array[index] = initialValue;
            System.out.printf("%d ", array[index]);
        }
    }

    /**
     * Создать квадратный двумерный целочисленный массив
     * (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
     * заполнить его диагональные элементы единицами (можно только одну из
     * диагоналей, если обе сложно). Определить элементы одной из диагоналей
     * можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static void task9(int n) {
        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, len = array[i].length; j < array[i].length; j++, len--) {
                if (i == j || i == len - 1)
                    array[i][j] = 1;
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void task8(int array[]) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] < 6)
                array[index] *= 2;
            System.out.printf("%d ", array[index]);
        }
    }

    /**
     * Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    static void task7(int array[]) {
        for (int index = 0; index <= array.length-1; index++) {
            array[index] = 1;
            array[index] += index;
            System.out.printf("%d ", array[index]);
        }
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void task6(int array[]) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 1)
                array[index] = 0;
            else
                array[index] = 1;
            System.out.printf("%d ", array[index]);
        }
    }

    /**
     * Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    static void task4(String str, int num) {
        for (int i = 1; i <= num; i++)
            System.out.println(str);
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    static void task3(int num) {
        System.out.println(num < 0);
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали
     * или отрицательное. Замечание: ноль считаем положительным числом.
     */
    static void task2(int num) {
        if (num >= 0)
            System.out.printf("%s => положительное число %n", num);
        else
            System.out.printf("%s => отрицательное число %n", num);
    }

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true,
     * в противном случае – false.
     */
    static void task1() {
        int minLimit = 10;
        int maxLimit = 20;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println(num1 + num2 >= minLimit && num1 + num2 <= maxLimit);

        in.close();
    }
}