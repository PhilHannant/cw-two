package game

import traits._


class GuessCheckerImpl extends GuessChecker{

  override def CheckGuess(ans: Array[Colours], code: Array[Colours]): Array[Int] = {

    val ans1 = ans.map(x => x)
    val code1 = code.map(x => x)

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
