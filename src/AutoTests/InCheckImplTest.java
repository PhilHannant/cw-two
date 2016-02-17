package AutoTests;

import Implementation.InCheckImpl;
import Interfaces.InputErrorChecker;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 17/02/2016.
 */
public class InCheckImplTest {

    @org.junit.Test
    public void testErrorCheckFalse() throws Exception {
        InputErrorChecker inEr = new InCheckImpl();
        char[] input = {'f', 'g', 'r', 'b'};
        boolean check = false;
        assertEquals(check, inEr.ErrorCheck(input));
    }
}