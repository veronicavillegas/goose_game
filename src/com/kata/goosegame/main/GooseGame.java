package com.kata.goosegame.main;

public class GooseGame {
    private final int BOARD_SIZE = 63;
    RuleChecker ruleChecker = new RuleChecker();

    public void printInstructionsForBoard() {
        for(int i = 1; i <= BOARD_SIZE; i++) {
            System.out.println(ruleChecker.getRuleDescription(i));
        }
    }

}
