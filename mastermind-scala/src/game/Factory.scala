package game

import com.softwaremill.macwire._
import traits.Game

object Factory {

  var easy: Boolean = true

  def getInstance(c: Class[_], b: Boolean): Game = {
    val GI: Game = wire [GameImpl]
    return GI
  }

  def getEasy(): Boolean = easy
}
