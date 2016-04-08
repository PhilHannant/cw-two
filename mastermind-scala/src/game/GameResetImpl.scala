package game

import traits.{Game, GameReset}

class GameResetImpl extends GameReset {
  override def ResetGames: Unit = {
    println("Would you like to reset the Game? Y/N")
    OutPattern(io.StdIn.readLine())
  }

  def OutPattern(input: String) = input match {

    case "Y" => val g: Game = Factory.getInstance(classOf[Game], true); g.runGames
    case "N" => System.exit(1)
    case _ => println("Wrong Input"); ResetGames
  }

}
