package main.java.five;

import java.util.List;

public class Board {
    private int[][] board;
    private Point maxEndPoint;

    public Board(Point maxEndPoint) {
        this.maxEndPoint = maxEndPoint;
        this.board = new int[maxEndPoint.getX() + 1][maxEndPoint.getY() + 1];
    }

    public void drawOnBoard(Line line) {
        List<Point> allPointsOnLine = line.getAllPointsOnLine();
        for (Point point : allPointsOnLine) {
            board[point.getX()][point.getY()] = board[point.getX()][point.getY()] + 1;
        }
    }

    public int calculateAllOverlappingLines() {
        int count = 0;
        for (int i = 0; i < maxEndPoint.getX(); i++) {
            for (int j = 0; j < maxEndPoint.getY(); j++) {
                if (board[i][j] > 1) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public void printBoard() {
        for (int i = 0; i < maxEndPoint.getX(); i++) {
            for (int j = 0; j < maxEndPoint.getY(); j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }
}
