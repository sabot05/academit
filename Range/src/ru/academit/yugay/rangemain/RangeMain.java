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
        Range range1 = new Range(2.5, 12.8);
        Range range2 = new Range(3.5, 16.1);

        System.out.printf("Интервал между заданными пунктами 2.5 и 9.8 равен: %.2f", range1.getLength());
        System.out.println();

        System.out.printf("Длина интервала равна: %.2f ", range1.getLength());
        System.out.println();

        Range crossRange = Range.getCrossRange(range1, range2);
        if (crossRange != null) {
            System.out.printf("Пересечение интервалов между: %.2f и %.2f", crossRange.getFrom(), crossRange.getTo());
        } else {
            System.out.println("Интервалы не пересекаются");
        }
        System.out.println();

        Range[] unionRange = Range.getUnion(range1, range2);
        System.out.print("Объединение двух интервалов: ");
        for (Range i : unionRange) {
            if (i == null) {
                break;
            }
            System.out.printf("от %.2f  до %.2f", i.getFrom(), i.getTo());
        }
    }
}