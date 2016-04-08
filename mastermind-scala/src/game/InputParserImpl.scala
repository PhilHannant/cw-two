package game

import traits._




class InputParserImpl(inputErrorChecker: InputErrorChecker) extends InputParser with Injector with Values{



  override def Input(): List[Colours] = {
    val input = io.StdIn.readLine()
    val field = CodeIn(input)
    val inColour: List [Colours] = field.map(n => colpos(n))
    inColour
  }


  def colpos(in :Char) :Colours = {
      var c :Colours = Blank
      charMap.zipWithIndex.foreach {
        case (x, i) => if (in == x) c = colour(i)
      }
      c
    }

  def CodeIn(in: String): List [Char] = {
    val inField = in.toCharArray.to[List]
    if (!inputErrorChecker.ErrorCheck(inField)){
      println("Sorry wrong input")
      val input = io.StdIn.readLine()
      CodeIn(in)
    }
    else return inField
  }
}




