package com.kata.goosegame.main;

import com.kata.goosegame.main.instructions.Instruction;
import com.kata.goosegame.main.instructions.factories.Factory;
import com.kata.goosegame.main.instructions.factories.FactoryImpl;

public class GooseGame {
    private final int BOARD_SIZE = 63;
    Factory factory = new FactoryImpl();

    public void printInstructionsForBoard() {
        for(int i = 1; i <= BOARD_SIZE; i++) {
            System.out.println(getInstructionForSpace(i));
        }
    }

    public String getInstructionForSpace(int space) {
        Instruction instruction = factory.createInstruction(space);
        return instruction.getInstruction();
    }
}
