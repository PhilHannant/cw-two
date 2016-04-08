package game


import traits.GuessCounter

class GuessCountImpl(var guess:Int) extends GuessCounter {


  override def GuessOccured: Unit = {
      guess = guess - 1
  }

  override def GuessLeft: Int = guess

}
