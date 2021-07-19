package com.kata.goosegame.main.instructions.factories;

import com.kata.goosegame.main.instructions.*;

public class FactoryImpl implements Factory {

    @Override
    public Instruction createInstruction(int space) {
        Instruction instruction = getInstructionForSpecificSpace(space);
        if(instruction == null) {
            instruction = getInstructionForRangeOfSpaces(space);
        }
        return instruction;
    }

    private Instruction getInstructionForRangeOfSpaces(int space) {
        if(isPrison(space)) {
            return new ThePrisonInstruction();
        }
        if(isMultipleOfSix(space)){
            return new MultipleOfSixInstruction();
        }
        return new SpaceInstruction(space);
    }

    private Instruction getInstructionForSpecificSpace(int space) {
        switch (space) {
            case 6 :
                return new BridgeInstruction();
            case 19:
                return new TheHotelInstruction();
            case 31:
                return new TheWellInstruction();
            case 42:
                return new TheMazeInstruction();
            default:
                return null;
        }
    }

    private boolean isMultipleOfSix(int space) {
        return space % 6 == 0;
    }

    private boolean isPrison(int space) {
        return space > 49 && space < 56;
    }
}
