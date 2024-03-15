package ru.job4j.array.ru.job4j.condition;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short size) {
        double result = (size - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 174;
        double man = Fit.manWeight(height);
        System.out.println("Man 174 is " + man);
        short size = 143;
        double woman = Fit.womanWeight(size);
        System.out.println("Woman 143 is " + woman);
    }
}