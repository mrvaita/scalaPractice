object PatternMatchingDemo {

  def main(args: Array[String]): Unit = {

    // function A
    println(matchPatternA(1))
    println(matchPatternA(2))
    println(matchPatternA(4))

    // function B
    println(matchPatternB(1))
    println(matchPatternB(2))
    println(matchPatternB("Three"))
    println(matchPatternB("Four"))
    println(matchPatternB("Five"))
  }

  def matchPatternA(x: Int) = {  // curling brackets can be omitted. See function B
    x match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "None of above"
    }
  }

  def matchPatternB(x: Any) = x match {  // If input `Any` => Output is `Any`

    case 1 => "One"
    case 2 => "Two"
    case "Three" => 3
    case "Four" => 4
    case _ => "None of above"

  }

}
