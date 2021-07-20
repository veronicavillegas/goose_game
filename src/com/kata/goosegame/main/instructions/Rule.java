package com.kata.goosegame.main.instructions;

public interface Rule {
    boolean accomplishRule(int squareIndex);
    String getDescription();
}
