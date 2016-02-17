package Implementation;

import Interfaces.*;

/**
 * Created by digibrose on 13/02/2016.
 */
public class GameImpl extends GameAbstractImpl {

    InteractionGenerator IntGen;
    CodeGenerator CodeGen;
    GuessChecker GuessCheck;
    InputErrorChecker InCheck;
    InputParser InParse;
    GuessCounter GCount;
    GameReset GReset;
    boolean endGame = false;
    int GameState = 0;
    char[] Answer;
    int[] CorrectMarkers;
    char[] Code;

    /**
     * Create a Game object.
     *
     * @param easy If easy is true the secret code will be
     *             revealed at all times when playing the game. If easy is
     *             false the secret code is not revealed until correctly guessed
     *             or the player runs out of turns.
     */
    public GameImpl(boolean easy) {
        super(easy);
        IntGen = new IntGenImpl();
        CodeGen = new CodeGenImpl();
        GuessCheck = new GuessCheckImpl();
        GCount = new GuessCounterImpl();
        InCheck = new InCheckImpl();
        InParse = new InputParserImpl();



    }

    @Override
    public void runGames() {
        System.out.println(IntGen.Message(GameState));
        Code = CodeGen.GenerateCode();
        GameState = 1;
        while(GCount.GuessLeft() > 0 || GameState == 2){
            System.out.println(IntGen.Message(GameState));
            Answer = InParse.InputParser(InCheck);
            CorrectMarkers = GuessCheck.CheckGuess(Answer, Code);
            GCount.GuessOccured();
            if (CorrectMarkers == GuessCheck.CorrectAns()) GameState = 2;
        }
        if (GameState == 1) GameState = 3;
        IntGen.Message(GameState);
        GReset.ResetGame(this);
    }
}
