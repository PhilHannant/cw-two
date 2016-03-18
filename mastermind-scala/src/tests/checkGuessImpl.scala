package tests
import traits._
import game._

class checkGuessImpl extends UnitSpec {

  "A checkGuessImpl" should "return a list of integers" in {
    val GC: GuessChecker = new GuessCheckerImpl
    val BlackWhite = GC.CheckGuess(Array(Red, Yellow, Orange, Blue), Array(Red, Yellow, Blue, Orange))
    assert(BlackWhite(0) == 2)
    assert(BlackWhite(1) == 2)
  }

}

  class checkGCountImpl extends UnitSpec{

    "A GCountImpl" should "count down" in {
      val GCount: GuessCounter = new GuessCountImpl(10)
      GCount.GuessOccured
      assert(GCount.GuessLeft == 9)
    }

}

  class inputParserImplTest extends UnitSpec {

    "An InputParserImpl" should "return an array of colours" in {
      val in: InputParser = new InputParserImpl(new InputErrorCheckerImpl())
      val expected: Array[Colours] = Array(Red, Blue, Yellow, Green)
      val t = in.Input()
      println(t.toList)
     assert(t.sameElements(expected))

    }



  }