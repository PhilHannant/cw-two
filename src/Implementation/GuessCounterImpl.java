package Implementation;

import Interfaces.GuessCounter;

/**
 * Created by digibrose on 13/02/2016.
 */
public class GuessCounterImpl implements GuessCounter {

    private int guess = 15;

    @Override
    public void GuessOccured() {
        guess--;
    }

    @Override
    public int GuessLeft() {
        return guess;
    }
}
