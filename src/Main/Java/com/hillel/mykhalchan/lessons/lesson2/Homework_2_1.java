package com.hillel.mykhalchan.lessons.lesson2;

public class Homework_2_1 {
    public static void main(String[] args) {
        int x = 41;
        int y = 53;
        float z = 24.9036F;
        int x1 = 12;
        int y1 = 29;
        float z1 = 32.5428F;
        char ch1;
        ch1 = '\u00B0';
        char ch2;
        ch2 = '\u0022';
        System.out.println("Координаты Коллизей");
        System.out.println("DMS Lat: " + x + ch1 + " " + y + "' " + z + ch2 + " N");
        System.out.println("DMS Long: " + x1 + ch1 + " " + y1 + "' " + z1 + ch2 + " E");
    }
}
