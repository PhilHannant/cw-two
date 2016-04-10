package traits

import com.softwaremill.macwire._
import game._

/**
  * Trait for the possible coloured markers
  */
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


/**
  * Trait for the values which are used in the game
  */

trait Values {
  lazy val codeLength: Int = 4
  lazy val colour = Vector(Red, Blue, Purple, Yellow, Green, Orange)
  lazy val charMap: Vector[Char] = colour.map(n => n.productPrefix.charAt(0))
  lazy val guessNumber = 20
}

/**
  * Trait which uses Macwire to generate the classes used in the game
  */

trait Injector {
  lazy val IntGen  = wire [IntGenImpl]
  lazy val GuessCheck = wire [GuessCheckerImpl]
  lazy val Incheck = wire [InputErrorCheckerImpl]
  lazy val InParse = wire [InputParserImpl]
  lazy val GCount = wire [GuessCountImpl]
  lazy val GReset = wire [GameResetImpl]

}

