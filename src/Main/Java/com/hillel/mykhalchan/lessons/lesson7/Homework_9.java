package com.hillel.mykhalchan.lessons.lesson7;
import java.util.Arrays;
public class Homework_9 {
    public static void main(String[] args) {
        int [] command1 = new int[25];
        int [] command2 = new int[25];

        for (int i = 0; i < 25; i++) {
            command1[i] = (int)((Math.random()*(40-18+1)) + 18);
            command2[i] = (int)((Math.random()*(40-18+1)) + 18);
        }
        System.out.println("Возвраст игроков команды 1: " + Arrays.toString(command1));
        System.out.println("Возвраст игроков команды 2: " + Arrays.toString(command2));

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < 25; i++) {
            sum1 += command1[i];
            sum2 += command2[i];
        }
        sum1/=25;
        sum2/=25;
                    System.out.println();
                    System.out.println("Средний возраст игроков команды 1: " + sum1);
                    System.out.println("Средний возраст игроков команды 2: " + sum2);

        }
    }
