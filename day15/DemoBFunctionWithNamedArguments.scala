object DemoBFunctionWithNamedArguments {

  def sum(x: Int, y:Int): Int = {
    println(s"value of x is $x and value of y is $y")
    return (x + y)
  }

  def main(args: Array[String]): Unit = {

    // I can specify names to the values that I pass. If I do that the order of
    // the arguments does not matter.
    var a = sum(y=2, x=3)
    println(a)

  }

}
