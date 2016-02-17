package Implementation;

import Interfaces.CodeGenerator;

import java.util.List;

/**
 * Created by digibrose on 13/02/2016.
 */
public class CodeGenImpl implements CodeGenerator {

    private char[] code;
    private double charNo;
    private final char[] colours = {'r', 'b', 'y', 'g'};


    public CodeGenImpl(){
        charNo = 4;
        GenerateCode();

    }

    @Override
    public  char[] GenerateCode() {
        code = new char[4];
        double ranum;
        boolean stopper = false;

        for(int i = 0; i<code.length; i++){
            ranum=Math.random();
            System.out.println("random: " + ranum);
            for(int j = 1; j<=charNo;j++){
                if (ranum <= j/charNo){
                    code[i]=colours[j-1];
                    break;
                }
            }

        }


        return code;
    }
}
