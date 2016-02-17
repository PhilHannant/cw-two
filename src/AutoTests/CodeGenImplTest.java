package AutoTests;


import Implementation.CodeGenImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by philhannant on 17/02/2016.
 */
public class CodeGenImplTest {

    private char[] returnCode;
    private CodeGenImpl coIm;
    private char[] colours = {'r', 'b', 'y', 'g'};

    @Before
    public void setUp(){
        coIm = new CodeGenImpl();
        returnCode = coIm.GenerateCode();

    }

    @org.junit.Test
    public void testGenerateCode() throws Exception {
        assertEquals(4, returnCode.length);

    }

    @Test
    public void testColours(){

    }

}