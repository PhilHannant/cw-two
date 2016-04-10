package game

import traits._

/**
  * Class which checks the players guess against the secret code
  */

class GuessCheckerImpl extends GuessChecker{

  /**
    * Class which asks user if they'd like to reset the game and runs OutPattern to match response to action
    *
    * @param ans a list of Colours representing the players answer
    * @param code a list of Colours representing the secret code
    * @return an array of ints representing the number of white and black markers
    */

  override def CheckGuess(ans: List[Colours], code: List[Colours]): Array[Int] = {

    val ans1 = ans.map(x => x).toArray
    val code1 = code.map(x => x).toArray

    def black(): Int = {
      var b = 0
      ans1.zipWithIndex.foreach{
        case (col, count) => if (ans1(count).equals(code1(count))){
          b = b + 1; code1.update(count, Blank); ans1.update(count, Blank)
        }
      };b
    }

    def white(): Int = {
      var w = 0
      for (i <- code1.indices; j <-code1.indices){
        if (ans1(i).equals(code1(j)) && !ans1(i).equals(code1(i))){
          w = w + 1; code1.update(j, Blank)
        }
      };w
    }
    val ret: Array[Int] = Array(black(),white())
    ret
  }
}
