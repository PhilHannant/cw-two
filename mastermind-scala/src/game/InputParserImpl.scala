package game

import traits._




class InputParserImpl(inputErrorChecker: InputErrorChecker) extends InputParser with Injector{



  override def Input(): Array[Colours] = {
    val input = "RBYG"//io.StdIn.readLine()
    val field = input.toCharArray
    println(field.toList)
//    val CharMap :Vector[Char] = colour.map(n => (n.getClass.getName.charAt(0) == field(1) )
////      n.getClass.getName.charAt(0) => n.getClass.getName)
//    val out : Array[Colours] = field.foreach(_ match{
//      case
//    })


    val CharMap :Vector[Char] =  colour.map(n => n.productPrefix.charAt(0))
println(CharMap.toList)
    def colpos(in :Char) :Colours = {
      var c :Colours = Blank
      CharMap.zipWithIndex.foreach{
        case(x,i) => if (in == x) c = colour(i); println(x); println(colour(i))
      }
      c
    }

    val InColour: Array[Colours] = field.map(n => colpos(n))


  InColour
  }

}




