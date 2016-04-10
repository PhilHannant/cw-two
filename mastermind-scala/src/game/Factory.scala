package game

import com.softwaremill.macwire._
import traits.Game

/** Factory for [[Game]] instances. */
object Factory {

  var easy: Boolean = true

  /** Creates a Game with the
    *
    * @return a new Game instance.
    */
  def getInstance(c: Class[_], b: Boolean): Game = {
    val GI: Game = wire [GameImpl]
    return GI
  }

  def getEasy(): Boolean = easy
}
