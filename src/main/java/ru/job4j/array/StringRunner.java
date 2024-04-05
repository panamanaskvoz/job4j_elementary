package ru.job4j.array;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        // Используем составной оператор += для добавления текста к переменной idea
        idea += " But I am a newbie. ";
        int year = 2022;
        // Снова используем оператор += для добавления года к строке
        idea += year;
        System.out.println(idea);
    }
}
