object DemoCFunctionWithNamedArguments {

  def divide(x:Int=5, y:Int=1): Double = {
    /** If I do not pass any values to the function, the default values will be
      * used to perform the division operation.
      */

      return (x / y.toDouble)
  }

  def main(args: Array[String]): Unit = {

    println(divide(2, 3))
    println(divide())
    println(divide(y=2))  // I can also decide to pass one parameter with its name. The default parameter will be used for the other parameter.


    // Take input from command line
    println("Enter 2 numbers:")
    var a:Int = scala.io.StdIn.readInt()
    var b:Int = scala.io.StdIn.readInt()
    println(s"$a / $b = ${divide(a, b)}")

  }

}
