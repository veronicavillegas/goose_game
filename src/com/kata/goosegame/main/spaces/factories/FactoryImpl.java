package com.kata.goosegame.main.spaces.factories;

import com.kata.goosegame.main.spaces.BridgeInstruction;
import com.kata.goosegame.main.spaces.Instruction;
import com.kata.goosegame.main.spaces.MultipleOfSixInstruction;
import com.kata.goosegame.main.spaces.NoMultipleOfSixInstruction;

public class FactoryImpl implements Factory {

    @Override
    public Instruction createInstruction(int space) {
        if(space == 6) {
            return new BridgeInstruction();
        }
        if(space % 6 == 0) {
            return new MultipleOfSixInstruction();
        }
        else return new NoMultipleOfSixInstruction(space);
    }
}
