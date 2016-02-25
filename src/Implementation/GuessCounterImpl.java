package Implementation;

import Interfaces.GuessCounter;

/**
 * Created by digibrose on 13/02/2016.
 */
public class GuessCounterImpl implements GuessCounter {

    private int guess;

    public GuessCounterImpl(int guess) {
        this.guess = guess;
    }

    @Override
    public void GuessOccured() {
        guess--;
    }

    @Override
    public int GuessLeft() {
        return guess;
    }
}
