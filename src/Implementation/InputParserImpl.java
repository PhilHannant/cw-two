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
    boolean cor = false;

    @Override
    public char[] InputParser(InputErrorChecker IE) {


        while(cor == false) {
            Input = SC.nextLine();
            output = Input.toCharArray();

            if (!IE.ErrorCheck(output)) {
                System.out.println("Sorry incorrect input please try again");
            } else {
                cor = true;
            }

        }
        cor = false;
        return output;
    }
}
