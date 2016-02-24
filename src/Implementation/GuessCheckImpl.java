package Implementation;

import Interfaces.GuessChecker;

/**
 * Created by digibrose on 13/02/2016. comment
 */
public class GuessCheckImpl implements GuessChecker {

    @Override
    public int[] CheckGuess(char[] Ans, char[] Code) {

        char[] inCode = Code.clone();


        int[] ret = new int[2];

        for (int k = 0; k < inCode.length; k++ ){
            if (Ans[k] == inCode[k]) {
                ret[1]++;
                Ans[k] = 0;
                inCode[k] = 0;
            }
        }

        for(int i = 0; i < inCode.length ; i++ ){
            for (int j = 0; j < inCode.length; j++){
                if (Ans[i] == inCode[j] && Ans[i] != inCode[i]){
                    ret[0]++;
                    Ans[i] = 0;
                    inCode[j] = 0;
                    break;
                }
            }
        }



        return ret;
    }

    @Override
    public int[] CorrectAns() {
        return new int[0];
    }
}
