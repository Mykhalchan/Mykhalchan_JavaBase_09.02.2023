package com.hillel.mykhalchan.lessons.lesson9;
    class Person {

        public Person(String name, String surname, String city, String phone) {

            this.name = name;

            this.surname = surname;

            this.city = city;

            this.phone = phone;

        }

        // "Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД можно по номеру + ТЕЛЕФОН"

        public String personInfo() {

            return "Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по телефону " + phone;

        }

        private String name;

        private String surname;

        private String city;

        private String phone;

    }

    class Main {

        public static void main(String[] args) {

            Person person1 = new Person("Сергей", "Михайлов", "Берлин", "+38 097 777 77 77");

            Person person2 = new Person("Владимир", "Снигуренко", "Лондон", "+38 063 777 77 77");

            Person person3 = new Person("Николай", "Дмитриев", "Нью-Йорк", "+38 050 777 77 77");

            System.out.println(person1.personInfo());

            System.out.println(person2.personInfo());

            System.out.println(person3.personInfo());

        }

    }