package org.example;

public class Board {
    public char[][] cells;

    public Board() {
        cells = new char[3][3];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = ' ';
            }
        }
    }

    public boolean isCellEmpty(int x, int y) {
        if (x >= 0 && x < 3 && y >= 0 && y < 3) {
            return cells[x][y] == ' ';
        }
        return false;
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        }
    }

    public void print() {
        System.out.println("----------------");
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print("| " + cells[i][j] + " |");
            }
            System.out.println();
            System.out.println("----------------");
        }
    }
    public String getBoardForPrint() {
        return null;}

    public char getCell(int r, int c) {
        if (r >= 0 && r < 3 && c >= 0 && c < 3) {
            return cells[r][c];
        }
        return ' ';
    }

    public boolean isFull() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = ' ';
            }
        }
    }
    public boolean hasWinner() {
        // Check the diagonal from left
        if (cells[0][0] != ' ' && cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) {
            return true;
        }
        // Check the diagonal from right
        if (cells[0][2] != ' ' && cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) {
            return true;
        }
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (cells[i][0] != ' ' && cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) {
                return true;
            }
            // Check columns
            if (cells[0][i] != ' ' && cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) {
                return true;
            }
        }
        return false;
    }

}
