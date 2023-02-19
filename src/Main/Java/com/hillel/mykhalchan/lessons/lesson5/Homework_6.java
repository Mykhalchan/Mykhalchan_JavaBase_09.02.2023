package com.hillel.mykhalchan.lessons.lesson5;

import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player = -1;
        int player2 = -1;
        int player3 = -1;
        int player4 = -1;
        int player5 = -1;
        int player11 = -1;
        int player22 = -1;
        int player33 = -1;
        int player44 = -1;
        int player55 = -1;

        System.out.println("Введите название первой команды");
        String title = scanner.nextLine();
        System.out.println("Введите название второй команды");
        String title2 = scanner.nextLine();

        System.out.println();

        System.out.println("Введите количество фрагов для первого игрока команды " + title);
        if (scanner.hasNextInt()) {
            player = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }
        System.out.println("Введите количество фрагов для второго игрока команды " + title);
        if (scanner.hasNextInt()) {
            player2 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для третьего игрока команды " + title);
        if (scanner.hasNextInt()) {
            player3 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для четвертого игрока команды " + title);
        if (scanner.hasNextInt()) {
            player4 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для пятого игрока команды " + title);
        if (scanner.hasNextInt()) {
            player5 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println();

        System.out.println("Введите количество фрагов для первого игрока команды " + title2);
        if (scanner.hasNextInt()) {
            player11 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }
        System.out.println("Введите количество фрагов для второго игрока " + title2);
        if (scanner.hasNextInt()) {
            player22 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для третьего игрока " + title2);
        if (scanner.hasNextInt()) {
            player33 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для четвертого игрока " + title2);
        if (scanner.hasNextInt()) {
            player44 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для пятого игрока " + title2);
        if (scanner.hasNextInt()) {
            player55 = scanner.nextInt();
        } else {
            System.out.println("Введите корректное значение в виде числа");
            System.exit(0);
        }

        System.out.println();

        int sum = player + player2 + player3 + player4 + player5;
        int sum1 = player11 + player22 + player33 + player44 + player55;
        int result = (player + player2 + player3 + player4 + player5) / 5;
        int result1 = (player11 + player22 + player33 + player44 + player55) / 5;
        if (result > result1) {
            System.out.println("Победила команда " + title + " и набрала " + sum + " фрагов" );
        } else {
            System.out.println("Победила команда " + title2 + " и набрала " + sum1 + " фрагов" );
        }
    }
}
