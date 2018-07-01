package ru.academit.yugay.range;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(2.5, 9.8);
        System.out.printf("Интервал между заданными пунктами 2.5 и 9.8 равен: %.2f", range.getLength());

        System.out.println();
        System.out.println("Определим, входит ли число в заданный диапазон.");
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if (range.isInside(number)) {
            System.out.println("Значение входит в диапазон от 2 до 10.");
        } else {
            System.out.println("Значение не входит в диапазон от 2 до 10.");
        }
    }
}
