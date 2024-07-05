package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("x")){
            ticTacToe = new TicTacToe();
            ticTacToe.start();
            System.out.println("press x to exit, everything else to continue");
            input = sc.next();
        }

    }
}