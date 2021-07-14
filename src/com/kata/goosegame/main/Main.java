package com.kata.goosegame.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        printInstructionsForBoard();
    }

    private static void printInstructionsForBoard() {
        final int BOARD_SIZE = 63;
        for(int i = 1; i <= BOARD_SIZE; i++) {
            if(i == 6) {
                System.out.println("The Bridge: Go to space 12");
            } if (i % 6 == 0) {
                System.out.println("Move two spaces forward.");
            } else {
                System.out.println("Stay in space " + i);
            }
        }
    }
}
