package game


import traits.{Values, GuessCounter}

/**
  * Class which counts down the number of guesses the player has left
  */

class GuessCountImpl() extends GuessCounter with Values{

  var guess = guessNumber

  /**
    * Function which increments the guesses left down by 1
    */
  override def GuessOccured: Unit = {
      guess = guess - 1
  }
  /**
    * Function that returns the number of guesses
    */
  override def GuessLeft: Int = guess

}
