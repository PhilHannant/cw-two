package game

import sun.plugin2.message.GetAppletMessage
import traits.Game

object Factory {



  def getInstance(c: Class[_], b: Boolean): Game = {
    val GI: Game = new GameImpl
    return GI
  }
}
