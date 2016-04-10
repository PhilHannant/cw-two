package game

import traits._


class GameImpl() extends GameAbstractImpl(Factory.getEasy()) {
  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */


  var gameState = 0
  val code :List[Colours] = List.fill(codeLength)(colour((Math.random() * colour.length).toInt))

  /**
    * Function which runs game output
    *
    */
  override def runGames = {

    println(IntGen.Message(gameState))
    if (getShowCode()) println("Code is" + code.toString)
    gameState = 1
    while(GCount.GuessLeft > 0 && gameState != 2 ){
      println("You have " + GCount.GuessLeft + " Guesses left")
      println(IntGen.Message(gameState))
      val Answer = InParse.Input()
      val CorrectMarkers = GuessCheck.CheckGuess(Answer, code)
      println("You Got " + CorrectMarkers(1) + " White Markers and " + CorrectMarkers(0) + " Black Markers")
      GCount.GuessOccured
      if (CorrectMarkers(0) == code.length) gameState = 2
    }
    if (gameState == 1) gameState = 3
    println(IntGen.Message(gameState))
    GReset.ResetGames
  }
}
