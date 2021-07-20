package com.kata.goosegame.main.instructions;

public class BridgeRule implements Rule {
    @Override
    public String getDescription() {
        return "The Bridge: Go to space 12";
    }

    @Override
    public boolean accomplishRule(int squareIndex) {
        return squareIndex == 6;
    }
}
