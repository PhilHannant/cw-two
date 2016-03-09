package tests
import traits._
import game._

class checkGuessImpl extends UnitSpec {

  "A checkGuessImpl" should "return a list of integers" in {
    val GC : GuessChecker = new GuessCheckerImpl
    val BlackWhite = GC.CheckGuess(Array(Red,Yellow,Orange,Blue), Array(Red,Yellow,Blue,Orange))
    assert(BlackWhite(0) ==2)
    assert(BlackWhite(1) ==2)
  }

}
