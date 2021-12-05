package test.five;

import static org.junit.jupiter.api.Assertions.assertTrue;

import main.java.five.Line;
import main.java.five.Point;
import org.junit.jupiter.api.Test;
class LineTest {

    @Test
    void testAllPointsOnLine_SamePoint() {
        // Arrange
        Line line1 = new Line(new Point(0,0), new Point(0,0));
        Line line2 = new Line(new Point(1,2), new Point(1,2));
        Line line3 = new Line(new Point(-1,-2), new Point(-1,-2));

        // Act & Assert
        assertTrue(line1.allPointsOnLine().contains(new Point(0,0)));
        assertTrue(line2.allPointsOnLine().contains(new Point(1,2)));
        assertTrue(line3.allPointsOnLine().contains(new Point(-1,-2)));
    }

    @Test
    void testAllPointsOnLine_HorizontalForward() {
        // Arrange
        Line line = new Line(new Point(0,0), new Point(0,3));

        // Act & Assert
        assertTrue(line.allPointsOnLine().contains(new Point(0,0)));
        assertTrue(line.allPointsOnLine().contains(new Point(0,1)));
        assertTrue(line.allPointsOnLine().contains(new Point(0,2)));
        assertTrue(line.allPointsOnLine().contains(new Point(0,3)));
    }

    @Test
    void testAllPointsOnLine_HorizontalBackward() {
        // Arrange
        Line line = new Line(new Point(0,0), new Point(0,-3));

        // Act & Assert
        assertTrue(line.allPointsOnLine().contains(new Point(0,0)));
        assertTrue(line.allPointsOnLine().contains(new Point(0,-1)));
        assertTrue(line.allPointsOnLine().contains(new Point(0,-2)));
        assertTrue(line.allPointsOnLine().contains(new Point(0,-3)));
    }

    @Test
    void testAllPointsOnLine_VerticalForward() {
        // Arrange
        Line line = new Line(new Point(0,0), new Point(3,0));

        // Act & Assert
        assertTrue(line.allPointsOnLine().contains(new Point(0,0)));
        assertTrue(line.allPointsOnLine().contains(new Point(1, 0)));
        assertTrue(line.allPointsOnLine().contains(new Point(2,0)));
        assertTrue(line.allPointsOnLine().contains(new Point(3, 0)));
    }

    @Test
    void testAllPointsOnLine_VerticalBackward() {
        // Arrange
        Line line = new Line(new Point(0,0), new Point(-3,0));

        // Act & Assert
        assertTrue(line.allPointsOnLine().contains(new Point(0,0)));
        assertTrue(line.allPointsOnLine().contains(new Point(-1, 0)));
        assertTrue(line.allPointsOnLine().contains(new Point(-2,0)));
        assertTrue(line.allPointsOnLine().contains(new Point(-3, 0)));
    }
}
