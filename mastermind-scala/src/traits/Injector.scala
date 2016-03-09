package traits

trait Colours
case object Red extends Colours
case object Blue extends Colours
case object Purple extends Colours
case object Yellow extends Colours
case object Green extends Colours
case object Orange extends Colours
case object Blank extends Colours

object Injector extends App {

  val codeLength: Int = 4
  val colour = Vector(Red, Blue, Purple, Yellow, Green, Orange)
  val code :Array[Colours] = Array.fill(4)(colour((Math.random() * 6).toInt))

  print("code is " + code.toList)

  val IntGen  :InteractionGenerator = ???
  val GuessCheck :GuessChecker = ???
  val Incheck :InputErrorChecker = ???
  val InParse :InputParser = ???
  val GCount :GuessCounter = ???
  val GReset :GameReset = ???

}

