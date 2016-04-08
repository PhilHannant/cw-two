package game


import traits.{Values, GuessCounter}

class GuessCountImpl() extends GuessCounter with Values{

  var guess = guessNumber

  override def GuessOccured: Unit = {
      guess = guess - 1
  }

  override def GuessLeft: Int = guess

}
