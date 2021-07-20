package com.kata.goosegame.main;

import com.kata.goosegame.main.instructions.*;

import java.util.ArrayList;
import java.util.List;

public class RuleChecker {
    private static List<Rule> rules;

    public RuleChecker() {
        this.rules = new ArrayList<>();
        this.rules.add(new BridgeRule());
        this.rules.add(new TheWellRule());
        this.rules.add(new TheHotelRule());
        this.rules.add(new TheMazeRule());
        this.rules.add(new ThePrisonRule());
        this.rules.add(new MultipleOfSixRule());
    }

    public String getRuleDescription(int squareIndex) {
        String description = new SpaceRule(squareIndex).getDescription();
        for (Rule rule : rules) {
            if(rule.accomplishRule(squareIndex)) {
                return rule.getDescription();
            }
        }
        return description;
    }
}
