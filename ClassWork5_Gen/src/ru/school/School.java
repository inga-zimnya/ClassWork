package ru.school;

public class School {
    int amount;
    Season season;

    public enum Season{
        WINTER("Зима", "Winter"),
        SPRING("Весна", "Spring"),
        SUMMER("Лето", "Summer"),
        AUTUMN("Осень", "Autumn");

        private String name;
        private String engName;


        Season(String name, String engName){
            this.name = name;
            this.engName = engName;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public School(int amount, Season season){
        this.amount = amount;
        this.season = season;
    }
}
