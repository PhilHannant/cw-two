package game

import traits._


class GameImpl() extends Game {
  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */


  var GameState = 0
  val Code = Injector.code


  override def runGames = {

    println(Injector.IntGen.Message(GameState))
    println("Code is" + Code)
    GameState = 1
    while(Injector.GCount.GuessLeft > 0 && GameState != 2 ){
      println("You have " + Injector.GCount.GuessLeft + " Guesses left")
      println(Injector.IntGen.Message(GameState))
      val Answer = Injector.InParse.Input(Injector.Incheck)
      val CorrectMarkers = Injector.GuessCheck.CheckGuess(Answer, Code)
      println("You Got " + CorrectMarkers(1) + " White Markers and " + CorrectMarkers(0) + " Black Markers")
      Injector.GCount.GuessOccured
      if (CorrectMarkers(1) == Code.length) GameState = 2
    }
    if (GameState == 1) GameState = 3
    print(Injector.IntGen.Message(GameState))
    Injector.GReset.ResetGames
  }
}
