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

        return null;
    }
}
