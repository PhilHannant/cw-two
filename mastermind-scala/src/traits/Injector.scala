package traits

trait Colours
case object Red extends Colours
case object Blue extends Colours
case object Purple extends Colours
case object Yellow extends Colours
case object Green extends Colours
case object Orange extends Colours
case object Blank extends Colours
case object Black extends Colours
case object White extends Colours

trait Injector {

  lazy val codeLength: Int = 4
  lazy val colour = Vector(Red, Blue, Purple, Yellow, Green, Orange)
  lazy val inCode :Array[Colours] = Array.fill(4)(colour((Math.random() * 6).toInt))

//  print("code is " + code.toList)

  lazy val IntGen  :InteractionGenerator = ???
  lazy val GuessCheck :GuessChecker = ???
  lazy val Incheck :InputErrorChecker = ???
  lazy val InParse :InputParser = ???
  lazy val GCount :GuessCounter = ???
  lazy val GReset :GameReset = ???

}

