package com.hillel.mykhalchan.lessons.lesson6;

import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {
        System.out.println("Я загадал число от 0 до 10. У Вас есть 3 попытки, чтоб его угадать.");
        System.out.println("Какое число я загадал?: ");
        Scanner gm = new Scanner(System.in);
            int a = 0;
            int b = 10;
            int random_number = a + (int) (Math.random() * b);
            for (int i = 0; i < 3; i++) {
                int digit = gm.nextInt();
                if (random_number == digit) {
                    System.out.println("Ура, ты угадал. Я загадал число " + random_number);
                } else if (random_number != digit) {
                        System.out.println("Вы не смогли отгадать число.");
                    }
                }
        System.out.println();
        System.out.println("Вы исчерпали 3 попітки. Я загадал число " + random_number);
        }
    }

