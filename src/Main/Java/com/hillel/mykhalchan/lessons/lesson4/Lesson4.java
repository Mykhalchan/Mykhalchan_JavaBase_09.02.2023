package com.hillel.mykhalchan.lessons.lesson4;
public class Lesson4 {
    public static void main(String[] args) {
        System.out.println();

        int SummaryWarriorLi = 860;
        int SummaryWarriorMin = (int) (860 * 1.5);

        System.out.println("Общее число войнов династии Ли - " + SummaryWarriorLi);
        System.out.println("Общее число войнов династии Мин - " + SummaryWarriorMin);

        System.out.println();

        System.out.println("Показатели атаки войнов династии Ли: ");

        int AttackRateWarriorLi = 13;
        int AttackRateArcherLi = 24;
        int AttackRateRiderLi = 46;

        System.out.println("Воин - " + AttackRateWarriorLi);
        System.out.println("Лучник - " + AttackRateArcherLi);
        System.out.println("Наездник - " + AttackRateRiderLi);

        System.out.println();

        System.out.println("Показатели атаки войнов династии Мин: ");
// fgdgdf
        int AttackRateWarriorMin = 9;
        int AttackRateArcherMin = 35;
        int AttackRateRiderMin = 12;

        System.out.println("Воин - " + AttackRateWarriorMin);
        System.out.println("Лучник - " + AttackRateArcherMin);
        System.out.println("Наездник - " + AttackRateRiderMin);

        System.out.println();
        System.out.println("Общий показатель атаки для обеих династий = " + ((AttackRateWarriorLi*SummaryWarriorLi+AttackRateArcherLi*SummaryWarriorLi+AttackRateRiderLi*SummaryWarriorLi)+(AttackRateWarriorMin*SummaryWarriorMin+AttackRateArcherMin*SummaryWarriorMin+AttackRateRiderMin*SummaryWarriorMin)));
        System.out.println();
        System.out.println("Общий показатель атаки армии династии Ли = " + ((AttackRateWarriorLi*SummaryWarriorLi+AttackRateArcherLi*SummaryWarriorLi+AttackRateRiderLi*SummaryWarriorLi)));
        System.out.println("Общий показатель атаки армии династии Мин = " + ((AttackRateWarriorMin*SummaryWarriorMin+AttackRateArcherMin*SummaryWarriorMin+AttackRateRiderMin*SummaryWarriorMin)));

    }
}
