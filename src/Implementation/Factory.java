package Implementation;

import Interfaces.Game;

public class Factory {

    public static Game getInstance(Class c, Boolean b){
        return new GameImpl(b);
    }
}
