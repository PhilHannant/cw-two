package Implementation;

import Interfaces.Game;
import Interfaces.GameReset;

import java.util.Scanner;

/**
 * Created by digibrose on 13/02/2016.
 */
public class GameResetImpl implements GameReset {
    @Override
    public void ResetGame() {

        System.out.println("Would you like to rest the game?");

        Scanner in = new Scanner(System.in);

        if (in.nextLine().charAt(0) == 'y'){
            Game g = Factory.getInstance(Game.class, true);
            g.runGames();
        }
        else {
            System.exit(1);
        }

    }
}
