package game

import traits._


/**
  * Class which parses the players input
  * @param inputErrorChecker
  */

class InputParserImpl(inputErrorChecker: InputErrorChecker) extends InputParser with Injector with Values{


  /**
    * Function which reads the players response and generates a list of colours corresponding to those
    *
    * @return a list of Colours representing the players guess
    */
  override def Input(): List[Colours] = {
    val input = io.StdIn.readLine()
    val field = CodeIn(input)
    val inColour: List [Colours] = field.map(n => colpos(n))
    inColour
  }

  /**
    * Function which returns the colour corresponding to the players guess
    * @return a Colour
    */
  def colpos(in :Char) :Colours = {
      var c :Colours = Blank
      charMap.zipWithIndex.foreach {
        case (x, i) => if (in == x) c = colour(i)
      }
      c
    }

  /**
    * Function which checks input for errors
    * @param in String read from players repsonse
    * @return list of chars
    */
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




