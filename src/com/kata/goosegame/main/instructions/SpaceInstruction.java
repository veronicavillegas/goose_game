package com.kata.goosegame.main.instructions;

public class SpaceInstruction implements Instruction {
    private int space;

    public SpaceInstruction(int space) {
        this.space = space;
    }

    @Override
    public String getInstruction() {
        return "Stay in space " + space;
    }
}
