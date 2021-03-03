import Array._

object DemoHAnonymousFunctions {

  def main(args: Array[String]): Unit = {

    var listOfNumbers = range(0, 10)

    //I can use map to apply functions.
    var square = (x:Int) => x * x
    println(listOfNumbers.map(num => square(num)).mkString(" "))

    // The anonymous function can be directly defined as argument of the map
    // function using shorthand notation.
    println(listOfNumbers.map((num:Int) => num * num).mkString(" "))
    
    // Even shorter (removing `Int`)
    println(listOfNumbers.map(num => num * num).mkString(" "))
    
    // Even shorter with `_` does not work but I could for example multiply by
    // two
    // println(listOfNumbers.map(_ * _).mkString(" "))  // ERROR!
    println(listOfNumbers.map(_ * 2).mkString(" "))

  }
}
