package com.kata.goosegame.main.instructions;

public class TheWellRule implements Rule {
    @Override
    public String getDescription() {
        return "The Well: Wait until someone comes to pull you out - they then take your place";
    }

    public boolean accomplishRule(int squareIndex) {
        return squareIndex == 31;
    }
}
