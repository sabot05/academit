package ru.academit.yugay.rangemain;

import ru.academit.yugay.range.Range;

import java.util.Scanner;

/**
 * Created by yugay on 04/07/2018.
 */
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

        System.out.println("Длина интервала равна: " + range.getLength());

    }
}
