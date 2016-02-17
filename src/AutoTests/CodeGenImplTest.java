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
    private char[] colours = {'r', 'b', 'y', 'g', 'o', 'p'};
    private boolean colbol = false;
    private boolean[] colarray = new boolean[4];
    private boolean[] coleq = {true, true, true, true};

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
        for(int i=0; i< returnCode.length;i++){
            for(int j=0; j<colours.length;j++){
                if (returnCode[i] == colours[j]) colbol = true;
            }
            System.out.print(returnCode[i] + ", ");
            colarray[i] = colbol;
        }

        assertArrayEquals(coleq, colarray );
    }

}