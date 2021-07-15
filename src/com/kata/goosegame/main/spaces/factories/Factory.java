package com.kata.goosegame.main.spaces.factories;

import com.kata.goosegame.main.spaces.Instruction;

public interface Factory {
    Instruction createInstruction(int space);
}
