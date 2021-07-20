package com.kata.goosegame.main.instructions;

public class TheMazeRule implements Rule {
    @Override
    public String getDescription() {
        return "The Maze: Go back to space 39";
    }
    @Override
    public boolean accomplishRule(int squareIndex) {
        return squareIndex == 42;
    }
}
