object DemoMFunctionByName {

  def main(args: Array[String]): Unit = {
    println(s"Main Function: ${exec(time())}")
    println("===========================")
    println(s"Main Function: ${exec2(time())}")
  }

  def time(): Long = {
    println("Inside time function")
    return System.nanoTime()
  }

  def exec(t:Long): Long = {
    /** t is a variable of type Long
      */
    println("Entering exec function")
    println(s"Time: $t")
    println("Exiting from exec function")
    return t
  }

  def exec2(t: => Long): Long = {
    /** t is a function that returns type Long
      */
    println("Entering exec function")
    println(s"Time: $t")
    println("Exiting from exec function")
    return t
  }

}

// EXEC function example:
// 1) The first function to be executed is the most inner one. Afterward the
// outer functions will be executed
//
// 2) Since the inner function was executed first, the parameter of the `exec`
// function is a number (dtype Long). For that reason the function call is by
// VALUE!
//
// EXEC2 function example:
// 1) The first function to be executed is exec2. Afterwards the inner function
//    is executed.
// 2) Since outer function was executed first, it will call the inner function
//    using the referenced argument `t`. This is called FUNCTION BY NAME.
//    Basically the time function was called twice and it will return two
//    different times as time passes.
