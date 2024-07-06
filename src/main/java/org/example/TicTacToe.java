package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe(){
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('0');
        currentPlayer = player2;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            board.print();
            if(board.hasWinner()){
                System.out.println("The Player:" + currentPlayer.getMarker() + " has won the Game");
                board.clear();
                continue;
            }
            if(board.isFull()){
                System.out.println("Its Draw");
                board.clear();
                continue;
            }
            switchPlayer();
            playTurn(sc);
        }
        // sc.close();
    }

    private void playTurn(Scanner sc) {
        while(true) {
            System.out.printf("Current Player: %c\n", currentPlayer.getMarker());
            int row = getValidInput(sc, "row");
            int col = getValidInput(sc, "column");
            if(board.isCellEmpty(row,col)){
                board.place(row, col, currentPlayer.getMarker());
                break;
            }
            System.out.println("Invaild Poistion");
        }
    }

    private int getValidInput(Scanner sc, String type) {
        int value;
        do {
            System.out.printf("%s (0-2): ", type);
            value = sc.nextInt();
            if (value > 2 || value < 0) {
                System.out.println("Please enter a number between 0 and 2");
            }
        } while (value > 2 || value < 0);
        return value;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}
