object DemoERecursiveFunctions {

  def factorial(n:Int): Int = {
    if (n <= 1) {
      return 1
    } else {
      return (n * factorial((n - 1)))
    }
  }

  def main(args: Array[String]): Unit = {

    var fact = factorial(4)
    println(fact)

  }

}
