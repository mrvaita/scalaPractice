object DemoPNestedFunctions {

  def main(args: Array[String]): Unit = {

    println(factorial(4))

  }

  def factorial(i:Int): Int = {

    def fact(x:Int, prevResult:Int): Int = {
      if (x <= 1) {
        prevResult
      } else {
        fact(x - 1, x * prevResult)
      }
    }

    var z = fact(i, 1)
    return z
  }

}
