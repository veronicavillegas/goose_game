package test;

import com.kata.goosegame.main.RuleChecker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GooseGameTest {
    RuleChecker factory;
    @Before
    public void setUp() {
        factory = new RuleChecker();
    }

    @Test
    public void whenNoRuleForSpace_thenPrintSpaceNumber(){
        assertEquals("Stay in space 1", factory.getRuleDescription(1));
    }

    @Test
    public void whenSpaceSix_thenBridge() {
        assertEquals("The Bridge: Go to space 12", factory.getRuleDescription(6));
    }
    @Test
    public  void whenSpaceMultipleOfSix_thenMoveForward() {
        assertEquals("Move two spaces forward.", factory.getRuleDescription(12));
        assertEquals("Move two spaces forward.", factory.getRuleDescription(18));
    }
    @Test
    public void whenSpace19_thenMissOneTurn() {
        assertEquals("The Hotel: Stay for (miss) one turn", factory.getRuleDescription(19));
    }

    @Test
    public void whenSpace31_thenTheWell() {
        assertEquals("The Well: Wait until someone comes to pull you out - they then take your place", factory.getRuleDescription(31));
    }

    @Test
    public void whenSpace42_thenTheMaze() {
        assertEquals("The Maze: Go back to space 39", factory.getRuleDescription(42));
    }

    @Test
    public void whenSpace50To55_thenThePrison() {
        int i = 50;
        while(i < 56) {
            assertEquals("The Prison: Wait until someone comes to release you - they then take your place", factory.getRuleDescription(i));
            i++;
        }
    }
}
