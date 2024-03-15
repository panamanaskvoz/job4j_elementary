package ru.job4j.condition;

public class TriangleArea {

    public static double area(double a, double b, double c) {
    double p = (a + b + c) / 2;
    double l = p - a;
    double h = p - b;
    double t = p - c;
    double z = p * l * h * t;
    double result = Math.sqrt(z);
    return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea (2, 2, 2);
        System.out.println("area(2, 2, 2) = " + result);
    }
}