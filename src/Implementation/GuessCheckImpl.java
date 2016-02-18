package Implementation;

import Interfaces.GuessChecker;

/**
 * Created by digibrose on 13/02/2016.
 */
public class GuessCheckImpl implements GuessChecker {

    @Override
    public int[] CheckGuess(char[] Ans, char[] Code) {

        int[] ret = new int[2];

        for(int i = 0; i < Code.length ; i++ ){
            for (int j = 0; j < Code.length; j++){
                if (Ans[i] == Code[j] && Ans[i] != Code[i]){
                    ret[0]++;
                    break;
                }
            }
        }

        for (int k = 0; k < Code.length; k++ ){
            if (Ans[k] == Code[k]) ret[1]++;
        }

        return ret;
    }

    @Override
    public int[] CorrectAns() {
        return new int[0];
    }
}
