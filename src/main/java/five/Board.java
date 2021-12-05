package main.java.five;

public class Board {
    private int[][] board;

    public Board(Point maxEndPoint) {
        this.board = new int[maxEndPoint.getX()][maxEndPoint.getY()];
    }

    void drawOnBoard(Line line) {
        if (line.isHorizontalLine()) {
            if (line.getStart().getY() <= line.getEnd().getY()) {
                for (int i = line.getStart().getY(); i <= line.getEnd().getY(); i++) {
                   // board[line.getStart().getX()][]
                }
            } else {
                for (int i = line.getStart().getY(); i <= line.getEnd().getY(); i++) {
                   // board[][]
                }
            }

        }
    }
}
