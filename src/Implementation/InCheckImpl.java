package Implementation;

import Interfaces.InputErrorChecker;

import java.util.List;

/**
 * Created by digibrose on 13/02/2016.
 */
public class InCheckImpl implements InputErrorChecker {

    private int codeLength;
    private char[] colours;
    private boolean colbol = false;
    private boolean[] colarray = new boolean[codeLength];

    public InCheckImpl(char[] colours, int codeLength) {
        this.colours = colours;
        this.codeLength = codeLength;
    }




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
