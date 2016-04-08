package game

import traits.InteractionGenerator


class IntGenImpl extends InteractionGenerator{
  override def Message(mes: Int): String = mes match {
    case 0 => return "Welcome to the Game"
    case 1 => return "Please make your Guess"
    case 2 => return "Yay you won"
    case 3 => return "Sorry you ran out of tries"
    case _ => return null
  }
}
