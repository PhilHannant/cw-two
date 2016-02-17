package Implementation;

import Interfaces.InputErrorChecker;

import java.util.List;

/**
 * Created by digibrose on 13/02/2016.
 */
public class InCheckImpl implements InputErrorChecker {

    private int codeLength = 4;
    private char[] colours = {'r', 'b', 'y', 'g', 'o', 'p'};
    private boolean colbol = false;
    private boolean[] colarray = new boolean[4];


    @Override
    public boolean ErrorCheck(char [] input) {

       if(input.length != codeLength){
           return false;
       }

        for(int i=0; i< codeLength;i++) {
            for (int j = 0; j < colours.length; j++) {
                if (input[i] == colours[j]) colbol = true;
            }
            colarray[i] = colbol;
        }

       for (int j = 0; j < codeLength; j++){
           if(!colarray[j]){
               return false;
           }
       }
        return true;
    }
}
