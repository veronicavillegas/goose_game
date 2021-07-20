package com.kata.goosegame.main.instructions;

public class ThePrisonRule implements Rule {

    @Override
    public String getDescription() {
        return "The Prison: Wait until someone comes to release you - they then take your place";
    }
    @Override
    public boolean accomplishRule(int squareIndex) {
        return squareIndex > 49 && squareIndex < 56;
    }
}
