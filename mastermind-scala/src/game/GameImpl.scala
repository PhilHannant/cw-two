package game

import traits._


class GameImpl() extends Game with Injector {
  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */


  var GameState = 0
  val Code = inCode


  override def runGames = {

    println(IntGen.Message(GameState))
    println("Code is" + Code)
    GameState = 1
    while(GCount.GuessLeft > 0 && GameState != 2 ){
      println("You have " + GCount.GuessLeft + " Guesses left")
      println(IntGen.Message(GameState))
      val Answer = InParse.Input()
      val CorrectMarkers = GuessCheck.CheckGuess(Answer, Code)
      println("You Got " + CorrectMarkers(1) + " White Markers and " + CorrectMarkers(0) + " Black Markers")
      GCount.GuessOccured
      if (CorrectMarkers(1) == Code.length) GameState = 2
    }
    if (GameState == 1) GameState = 3
    print(IntGen.Message(GameState))
    GReset.ResetGames
  }
}
