package com.kata.goosegame.main.instructions.factories;

import com.kata.goosegame.main.instructions.Instruction;

public interface Factory {
    Instruction createInstruction(int space);
}
