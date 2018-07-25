package ru.academit.yugay.range;

/**
 * Created by yugay on 04/07/2018.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return (number >= this.from) && (number <= this.to);

    }

    public static Range getCrossRange(Range range1, Range range2) {
        double crossFrom;
        double crossTo;

        if (range1.getFrom() > range2.getFrom()) {
            crossFrom = range1.getFrom();
        } else {
            crossFrom = range2.getFrom();
        }

        if (range1.getTo() > range2.getTo()) {
            crossTo = range2.getTo();
        } else {
            crossTo = range1.getTo();
        }

        if (crossFrom < crossTo) {
            Range crossRange = new Range(crossFrom, crossTo);
            return crossRange;
        }
        return null;
    }

    public static Range[] getUnion(Range range1, Range range2) {
        double from;
        double to;
        Range[] unionRange = new Range[2];
        if (range1.getFrom() > range2.getTo() || range2.getFrom() > range1.getTo()) {
            unionRange[0] = range1;
            unionRange[1] = range2;
        } else {
            from = Math.min(range1.getFrom(), range2.getFrom());
            to = Math.max(range1.getTo(), range2.getTo());
            unionRange[0] = new Range(from, to);
            unionRange[1] = null;
        }
        return unionRange;
    }

    }
