package com.hillel.mykhalchan.lessons.lesson8;
import java.util.Arrays;
import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк - ");
        int N = in.nextInt();
        System.out.print("Введите количество столбцов - ");
        int M = in.nextInt();
        int[][] mass = new int[N][M];
        int[][] result = new int[M][N];
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print("Введите элемент массива - ");
                int a = in.nextInt();
                mass[i][j] = a;
            }
        }
        System.out.println();
        System.out.println("Исходная матрица: ");
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println(); //Вывод на экран
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mass[j][i];
            }
        }
        System.out.println();
        System.out.println("Новая матрица: ");
        System.out.println();
                for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");}
            System.out.println();
        }
    }
}
