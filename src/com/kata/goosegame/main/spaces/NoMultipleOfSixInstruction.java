package com.kata.goosegame.main.spaces;

public class NoMultipleOfSixInstruction implements Instruction {
    private int space;

    public NoMultipleOfSixInstruction(int space) {
        this.space = space;
    }

    @Override
    public String getInstruction() {
        return "Stay in space " + space;
    }
}
