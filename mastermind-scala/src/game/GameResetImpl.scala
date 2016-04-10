package game

import traits.{Game, GameReset}

/**
  * Class which asks user if they'd like to reset the game and runs OutPattern to match response to action
  */

class GameResetImpl extends GameReset {
  override def ResetGames: Unit = {
    println("Would you like to reset the Game? Y/N")
    OutPattern(io.StdIn.readLine())
  }
  /**
    * Function which matchs the players response.
    *
    * @param input the command read from the player
    */
  def OutPattern(input: String) = input match {

    case "Y" => val g: Game = Factory.getInstance(classOf[Game], true); g.runGames
    case "N" => System.exit(1)
    case _ => println("Wrong Input"); ResetGames
  }

}
