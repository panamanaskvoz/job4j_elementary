package ru.job4j.array.ru.job4j.condition;

public class Point {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static double distance(int x1, int y1, int x2, int y2) {
        double baby = x2 - x1;
        double size = y2 - y1;
        double firstBaby = Math.pow(baby, 2);
        double firstSize = Math.pow(size, 2);
        double result = firstBaby + firstSize;
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(7, 31, 2, 19);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
