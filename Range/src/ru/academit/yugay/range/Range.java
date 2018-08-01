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

    public Range getCrossRange(Range range2) {
        if (from < range2.to && to > range2.from) {
            return new Range(Math.max(from, range2.from), Math.min(range2.to, to));
        }
        return null;
    }

    public Range[] getUnion(Range range2) {
        if (from <= range2.to && to >= range2.from) {
            return new Range[]{new Range(Math.min(from, range2.from), Math.max(to, range2.to))};
        } else {
            return new Range[]{new Range(from, to), new Range(range2.from, range2.to)};
        }
    }

    public Range[] getDifference(Range range2) {
        if (from < range2.from && to <= range2.to) {
            return new Range[]{new Range(from, Math.min(to, range2.from))};
        } else if (from >= range2.from && to > range2.to) {
            return new Range[]{new Range(Math.max(from, range2.to), to)};
        } else if (from < range2.from && to > range2.to) {
            return new Range[]{new Range(from, range2.from), new Range(range2.to, to)};
        } else {
            return new Range[]{};
        }
    }
}
