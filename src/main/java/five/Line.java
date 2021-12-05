package main.java.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    boolean isHorizontalLine() {
        return start.getX() == end.getX();
    }

    boolean isVerticalLine() {
        return start.getY() == end.getY();
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public List<Point> allPointsOnLine() {
        List<Point> result = new ArrayList<>();
            int steps = 0;
            int direction = 1;

        if (this.isHorizontalLine()) {

            if (start.getY() <= end.getY()) {
                steps = end.getY() - start.getY();
            } else {
                steps = start.getY() - end.getY();
                direction = -1;
            }

            for (int i = 0; i <= steps; i++) {
                result.add(new Point(start.getX(), start.getY() + direction * i));
            }
        } else if (this.isVerticalLine()) {
            if(start.getX() <= end.getX()) {
                steps = end.getX() - start.getX();
            } else {
                steps = start.getX() - end.getX();
                direction = -1;
            }
            for (int i = 0; i <= steps; i++) {
                result.add(new Point(start.getX() + direction * i, start.getY()));
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
