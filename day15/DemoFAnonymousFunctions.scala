object DemoFAnonynousFunctions {

  def incrementValue(x:Int): Int = {
    return (x + 1)
  }

  // Using anonymous function
  var increment = (x:Int) => x + 1  // (X:Int) is the input. After the `=>` you have the function body.

  // Anonymous functions can have 0 input parameters and 0 output parameters.
  var printHelloWorld = () => println("Hello World")

  // Anonymous functions with two input parameters
  var add = (x:Int, y:Int) => {x + y}  // `{}` are optional but can be used for more complex functions.

  def main(args: Array[String]): Unit = {

    var x = 7

    println(s"Increment function output for x=$x is ${incrementValue(x)}")
    println(s"Increment anonymous function output for x=$x is ${increment(x)}")
    
    printHelloWorld()

    var y = 5
    println(add(x, y))

  }

}
