package com.hillel.mykhalchan.lessons.lesson6;

public class Homework_8 {
    public static void main(String[] args) {

        int shuttle = 0, value = 0;
        while (shuttle < 100) {
            String s = String.valueOf(++value);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println("Номер шатла - " +value);
            shuttle++;
        }
        System.out.println("Общее количество шатлов: " + shuttle);

    }
}
