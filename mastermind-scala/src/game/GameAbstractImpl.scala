package game

import traits.{Values, Injector, Game}

import scala.Enumeration.ValueSet

abstract class GameAbstractImpl extends Game with Injector with Values {
  private var showCode: Boolean = false

  /**
    * Create a Game object.
    *
    * @param easy If easy is true the secret code will be
    *             revealed at all times when playing the game. If easy is
    *             false the secret code is not revealed until correctly guessed
    *             or the player runs out of turns.
    */
  def this(easy: Boolean) {
    this()
    println("running")
    showCode = easy
  }

  def getShowCode(): Boolean = showCode
}
