package tests
import traits._
import game._

class checkGuessImpl extends UnitSpec {

  "A checkGuessImpl" should "return a list of integers" in {
    val GC: GuessChecker = new GuessCheckerImpl
    val BlackWhite = GC.CheckGuess(List(Red, Yellow, Orange, Blue), List(Red, Yellow, Blue, Orange))
    assert(BlackWhite(0) == 2)
    assert(BlackWhite(1) == 2)
  }

}

  class checkGCountImpl extends UnitSpec{

    "A GCountImpl" should "count down" in {
      val GCount: GuessCounter = new GuessCountImpl()
      GCount.GuessOccured
      assert(GCount.GuessLeft == 19)
    }

}
//  tested with dummy string
//  class inputParserImplTest extends UnitSpec {
//
//    "An InputParserImpl" should "return an array of colours" in {
//      val ie :InputErrorChecker = new InputErrorCheckerImpl()
//      val in: InputParser = new InputParserImpl(ie)
//      val expected: List[Colours] = List(Red, Blue, Yellow, Green)
//      val t = in.Input()
//      println(t.toList)
//      assert(t.sameElements(expected))
//
//    }
//  }

  class intGenImplTest extends UnitSpec {
    "An intGentImpl Message" should "return a string" in {
      val intGen: InteractionGenerator = new IntGenImpl()
      assert(intGen.Message(0).equals("Welcome to the Game"))
      assert(intGen.Message(1).equals("Please make your Guess"))
      assert(intGen.Message(2).equals("Yay you won"))
    }
  }

class InputErrorCheckerImplTest extends UnitSpec with Values {
  "An InputErrorChecker" should "return true with correct String" in {
    val IE :InputErrorChecker = new InputErrorCheckerImpl
    val inList :List[Char] = List('R','G','B','P')
    val wrongList :List[Char] = List('K','C','U','F')
    assert(IE.ErrorCheck(inList))
    assert(!IE.ErrorCheck(wrongList))
  }
}





