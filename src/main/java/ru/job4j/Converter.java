package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 40;
    }

    public static void main(String[] args) {
        float input = 280;
        float expectedEuro = 4;
        float outputEuro = Converter.rubleToEuro(input);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("280 rubles are 4 euros. Test result: " + passedEuro);

        float expectedDollar = 7;
        float outputDollar = Converter.rubleToDollar(input);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("280 rubles are 7 dollars. Test result: " + passedDollar);
    }
}