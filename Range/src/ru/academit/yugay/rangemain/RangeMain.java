package ru.academit.yugay.rangemain;

import ru.academit.yugay.range.Range;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by yugay on 04/07/2018.
 */
public class RangeMain {
    public static void main(String[] args) {
        Range range1 = new Range(0.5, 18.8);
        Range range2 = new Range(1.5, 14.1);

        System.out.printf("Интервал между заданными пунктами 2.5 и 9.8 равен: %.2f", range1.getLength());
        System.out.println();

/*
        System.out.println("Определим, входит ли число в заданный диапазон.");
        System.out.println("Введите значение: ");

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if (range1.isInside(number)) {
            System.out.println("Значение входит в диапазон от 2 до 10.");
        } else {
            System.out.println("Значение не входит в диапазон от 2 до 10.");
        }
*/
        System.out.printf("Длина интервала равна: %.2f ", range1.getLength());
        System.out.println();

        Range crossRange = range1.getCrossRange(range2);
        if (crossRange != null) {
            System.out.printf("Пересечение интервалов между: %.2f и %.2f", crossRange.getFrom(), crossRange.getTo());
        } else {
            System.out.println("Интервалы не пересекаются");
        }
        System.out.println();

        Range[] unionRange = range1.getUnion(range2);
        System.out.print("Объединение двух интервалов: ");
        for (Range i : unionRange) {
            if (i == null) {
                break;
            }
            System.out.printf("от %.2f  до %.2f", i.getFrom(), i.getTo());
        }
        System.out.println();

        Range[] differenceRange = range1.getDifference(range2);
        System.out.println("Разность двух интревалов: ");
        for (Range i : differenceRange) {
            if (i == null) {
                break;
            }
            System.out.printf("%.2f %.2f%n", i.getFrom(), i.getTo());
        }
    }
}