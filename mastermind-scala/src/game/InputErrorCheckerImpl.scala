package game
import traits._

/**
  * Class which checks the input for errors
  */

class InputErrorCheckerImpl extends InputErrorChecker with Values{

  /**
    * Function which error checks
    * @param input a list of Chars representing the players response
    * @return Boolean representing if the players input is valid or not
    */
  override def ErrorCheck(input: List[Char]): Boolean = {
    var res: Boolean = true
    input.foreach(n => if(!(charMap contains (n))) res = false)
    if(input.length != codeLength) res = false
    res
  }
}
