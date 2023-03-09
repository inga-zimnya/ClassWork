package ru.school;

public class Enums {
    public static void main(String[] args) {
        enum Season {WINTER, SPRING, SUMMER, AUTUMN}
        Season season = Season.WINTER;
        System.out.println(season);

        System.out.println(DayOfWeek.FRIDAY);
    }

    public enum DayOfWeek {
        SUNDAY("Воскресенье"),
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота");
        private String title;

        DayOfWeek(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }


}
