package com.kata.goosegame.main.instructions.factories;

import com.kata.goosegame.main.instructions.BridgeInstruction;
import com.kata.goosegame.main.instructions.Instruction;
import com.kata.goosegame.main.instructions.MultipleOfSixInstruction;
import com.kata.goosegame.main.instructions.NoMultipleOfSixInstruction;

public class FactoryImpl implements Factory {

    @Override
    public Instruction createInstruction(int space) {
        if(space == 6) {
            return new BridgeInstruction();
        }
        if(isMultipleOfSix(space)) {
            return new MultipleOfSixInstruction();
        }
        else return new NoMultipleOfSixInstruction(space);
    }

    private boolean isMultipleOfSix(int space) {
        return space % 6 == 0;
    }
}
