package com.kata.goosegame.main;

import com.kata.goosegame.main.instructions.Instruction;
import com.kata.goosegame.main.instructions.factories.Factory;
import com.kata.goosegame.main.instructions.factories.FactoryImpl;

public class GooseGame {
    private final int BOARD_SIZE = 63;
    Factory factory = new FactoryImpl();

    public void printInstructionsForBoard() {
        for(int i = 1; i <= BOARD_SIZE; i++) {
            Instruction instruction = factory.createInstruction(i);
            printInstruction(instruction);
        }
    }

    private void printInstruction(Instruction instruction) {
        System.out.println(instruction.getInstruction());
    }
}
