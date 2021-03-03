object DemoCFunctionWithNamedArguments {

  def printMultipleTimes(n:Int, args:String*): Unit = {
    /** The `String*` argument means that it is expecting an array of Strings.
      * `star` parameter MUST always come last! You cannot specify more than one
      * `star` parameters.
      */

    for (arg <- args) {
      println(arg * n)  // Multiplying a string will copy the string n times (like in python)
    }
  }

  def main(args: Array[String]): Unit = {

    printMultipleTimes(3, args="Hello", "World", "Italy")

  }

}
