package ru.school;

public class Main {
    public static void main(String[] args) {
        School newSchool = new School(3400, School.Season.SUMMER);
//        System.out.println(newSchool.amount);
//        System.out.println(newSchool.season);

        School.Season currentSeason = newSchool.season;
        if(currentSeason != School.Season.SUMMER){
            System.out.printf("Школа №888б учащихся %d, сейчас %s, и " +
                    "мы учимся", newSchool.amount, newSchool.season);
        } else {
            System.out.printf(
                    "Школа №888, учащихся %d, сейчас мы отдыхаем",
                    newSchool.amount
            );
        }


    }
}
