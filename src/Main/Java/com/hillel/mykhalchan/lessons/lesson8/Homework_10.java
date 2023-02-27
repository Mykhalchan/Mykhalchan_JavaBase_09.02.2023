package com.hillel.mykhalchan.lessons.lesson8;
import java.util.Arrays;
import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        int[] digitorg = new int[7];
        for(int i = 0; i < digitorg.length; i++) {
            digitorg[i] = (int)(Math.random() * 10);
        }
        Arrays.sort(digitorg);
        System.out.println();
        System.out.println("Введите 7 цифр от 0 до 9: ");
        Scanner dp = new Scanner(System.in);
        int digitplayer[] = new int[7];
        for(int i=0; i< digitplayer.length; i++){
            digitplayer[i] = dp.nextInt();
        }
        Arrays.sort(digitplayer);
        System.out.println();
        System.out.print(Arrays.toString(digitorg));
        System.out.println();
        System.out.print(Arrays.toString(digitplayer));

        int count = 0;
        for (int i=0; i<digitplayer.length; i++){
            if (digitorg[i]==digitplayer[i]) count++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Найдено " +count + " совпадений");
    }
    }
