package Implementation;

import Interfaces.InteractionGenerator;

/**
 * Created by digibrose on 13/02/2016.
 */
public class IntGenImpl implements InteractionGenerator {
    @Override
    public String Message(int GameState) {

        if (GameState == 0)return "Welcome to the Game";
        if (GameState == 1)return "Please make your guess";
        if (GameState == 2)return "Yay you won";
        if (GameState == 3)return "Sorry you ran out of tries";

        return null;
    }
}
