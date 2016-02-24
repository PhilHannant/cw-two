package Implementation;

import Interfaces.Game;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MastermindDriver {

    // Example - change as you need to...
    public static void main(String[] args) throws Exception {

        Game g = Factory.getInstance(Game.class, true);
        g.runGames();

      //  g = Factory.getInstance(Game.class, false);
      //  g.runGames();


    }



}