package com.kata.goosegame.main.instructions;

public class TheHotelRule implements Rule {

    @Override
    public String getDescription() {
        return "The Hotel: Stay for (miss) one turn";
    }
    @Override
    public boolean accomplishRule(int squareIndex) {
        return squareIndex == 19;
    }
}
