package AutoTests;

import Implementation.GuessCheckImpl;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by philhannant on 17/02/2016.
 */
public class GuessCheckImplTest {

    @Test
    public void testCheckCorrectGuess() {
        GuessCheckImpl gc = new GuessCheckImpl();
        char[] inputAnswer = {'r', 'g', 'b', 'o'};
        char[] inputCode = {'r', 'g', 'b', 'o'};
        int[] expected = {0, 4};
        int[] output = gc.CheckGuess(inputAnswer, inputCode);
        assertEquals(expected[1], output[1]);
        assertEquals(expected[0], output[0]);
    }

    @Test
    public void testCheckGuessPosition() {
        GuessCheckImpl gc = new GuessCheckImpl();
        char[] inputAnswer = {'g', 'r', 'o', 'b'};
        char[] inputCode = {'r', 'g', 'b', 'o'};
        int[] expected = {4, 0};
        int[] output = gc.CheckGuess(inputAnswer, inputCode);
        assertEquals(expected[1], output[1]);
        assertEquals(expected[0], output[0]);
    }

    @Test
    public void testCheckGuessPosition2() {
        GuessCheckImpl gc = new GuessCheckImpl();
        char[] inputCode = {'g', 'y', 'g', 'g'};
        char[] inputAnswer = {'o', 'o', 'y', 'y'};
        int[] expected = {1, 0};
        int[] output = gc.CheckGuess(inputAnswer, inputCode);
        assertEquals(expected[1], output[1]);
        assertEquals(expected[0], output[0]);
    }


}