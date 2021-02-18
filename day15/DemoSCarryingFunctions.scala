// Parameters are passed into multiple brackets (see below)
// FUNCTION CHAINING: It is the combination of Function carrying separate
// parameters in different brackets + its usage into partially applied
// functions.
object DemoSCarryingFunctions {

  def main(args: Array[String]): Unit = {
    
    val str1 = "Hello"
    val str2 = "World"

    println(s"str1, str2 ${printSomethingStandard(str1, str2)}")
    println(s"str1, str2 ${printSomethingCarrying(str1)(str2)}")
    println(s"str1, str2 ${printSomethingCarryingOneLine(str1)(str2)}")

    // Partial functions can also be used to implement partial functions. The
    // second argument is specified with `_`.
    // NOTE: The partial function does not work when it is implemented using
    // `printSomethingCarryingOneLine`. (?)
    val byeFunction = printSomethingCarrying("Bye")_
    println(s"Bye + str2: ${byeFunction(str2)}")
  
  }

  // Standard function
  def printSomethingStandard(str1:String, str2:String): String = {
    return (str1 + " " + str2)
  }

  // Carrying Function. It is used to perform function chaining
  def printSomethingCarrying(str1:String)(str2:String): String = {
    return (str1 + " " + str2)
  }

  // Carrying function as one liner
  def printSomethingCarryingOneLine(str1:String) = (str2:String) => str1 + " " + str2

}
