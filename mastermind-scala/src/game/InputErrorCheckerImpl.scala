package game
import traits._

class InputErrorCheckerImpl extends InputErrorChecker with Values{
  override def ErrorCheck(input: Array[Colours]): Boolean = {
    var res: Boolean = true
    input.foreach(n => if(!(CharMap contains (n))) res = false)
    if(input.length != codeLength) res = false
    res
  }
}
