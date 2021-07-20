package com.kata.goosegame.main.instructions;

public class SpaceRule implements Rule {
    private int square;

    public SpaceRule(int square) {
        this.square = square;
    }

    @Override
    public boolean accomplishRule(int squareIndex) {
        return true;
    }

    @Override
    public String getDescription() {
        return "Stay in space " + square;
    }
}
