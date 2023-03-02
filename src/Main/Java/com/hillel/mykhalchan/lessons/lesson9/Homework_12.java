package com.hillel.mykhalchan.lessons.lesson9;
import java.util.Arrays;
import java.util.Scanner;

public class Homework_12 {
    class Person {

        public Person(String name, String surname, String city, String phone) {

            this.name = name;

            this.surname = surname;

            this.city = city;

            this.phone = phone;

        }

        // "Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД можно по номеру + ТЕЛЕФОН"

        public String personInfo() {

            return "Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + phone;

        }

        private String name;

        private String surname;

        private String city;

        private String phone;

    }

    class Main {

        public void main(String[] args) {

            Person person1 = new Person("Bob", "Chep", "Нью-Йорк", "2936729462846");

            Person person2 = new Person("Janie", "Wook", "Шанхай", "12325436454");

            Person person3 = new Person("Sheron", "Raze", "London", "37754634686");

            System.out.println(person1.personInfo());

            System.out.println(person2.personInfo());

            System.out.println(person3.personInfo());

        }

    }
}
