object DemoIFunctionCallByName {

  def main(args: Array[String]): Unit = {

    // When I pass a function as a parameter for another function the () don't
    // need to be specified. `2` is the parameter for the passed function.
    printValue(increment, 2)
    printValue(decrement, 2)

    // Implementing a calculator function
    var a = 5
    var b = 2
    println(s"$a + $b = ${calculator(add, a, b)}")
    println(s"$a - $b = ${calculator(sub, a, b)}")
    println(s"$a * $b = ${calculator(mul, a, b)}")
    println(s"$a / $b = ${calculator(div, a, b)}")
    println(s"$a % $b = ${calculator(mod, a, b)}")

  }

  // Functions can accept other functions as parameters as following
  // `m: => Int`: m is the function accepted, (Int) is the input dtype and Int
  // is its return dtype. `x` is the function parameter
  def printValue(m: (Int) => Int, x:Int): Unit = {
    println(s"New value is: ${m(x)}")
  }

  def increment(y:Int): Int = {
    return y + 1
  }

  def decrement(y:Int): Int = {
    return y - 1
  }

  // ===================== Calculator Function =====================

  def calculator(m: (Int, Int) => Int, x:Int, y:Int): Int = {
    return m(x, y)
  }

  // `: (Int, Int) => Int` is optional
  var add: (Int, Int) => Int = (x:Int, y:Int) => (x + y)
  var sub: (Int, Int) => Int = (x:Int, y:Int) => (x - y)
  var mul = (x:Int, y:Int) => (x * y)
  var div = (x:Int, y:Int) => (x / y)
  var mod = (x:Int, y:Int) => (x % y)

}
