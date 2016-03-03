package traits

trait Colours
case object Red extends Colours
case object Blue extends Colours
case object Purple extends Colours
case object Yellow extends Colours
case object Green extends Colours
case object Orange extends Colours

object Injector extends App{

  val codeLength: Int = 4
  val colour = Vector (Red, Blue, Purple, Yellow, Green, Orange )


  val code = List.tabulate(4)(n => colour((Math.random()*6).toInt))
  print(code.toList)


}