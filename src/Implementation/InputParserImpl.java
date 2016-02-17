package Implementation;

import Interfaces.InputErrorChecker;
import Interfaces.InputParser;

import java.util.Scanner;

/**
 * Created by digibrose on 13/02/2016.
 */
public class InputParserImpl implements InputParser {

    Scanner SC = new Scanner(System.in);
    String Input;
    char[] output;

    @Override
    public char[] InputParser(InputErrorChecker IE) {

        Input = SC.nextLine();
        output = Input.toCharArray();


        return output;
    }
}
