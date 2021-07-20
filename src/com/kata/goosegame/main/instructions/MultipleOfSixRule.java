package com.kata.goosegame.main.instructions;

public class MultipleOfSixRule implements Rule {
    @Override
    public String getDescription() {
        return "Move two spaces forward.";
    }

    @Override
    public boolean accomplishRule(int squareIndex) {
        return squareIndex % 6 == 0;
    }
}
