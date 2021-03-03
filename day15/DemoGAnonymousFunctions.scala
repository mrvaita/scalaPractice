import Array._

object DemoGAnonymousFunctions {

  def divisibleByThree(x:Int): Boolean = {
    return (x % 3 == 0)
  }

  // With anonymous function
  var divByThree = (x:Int) => {x % 3 == 0}

  def main(args: Array[String]): Unit = {

    var listOfNumbers = range(0, 10)

    println(listOfNumbers.map(num => divisibleByThree(num)).mkString(" "))
    println(listOfNumbers.map(num => divByThree(num)).mkString(" "))

    // Using Filter (You get the fraction of numbers divisible by three)
    println(listOfNumbers.filter(num => num % 3 == 0).mkString(" "))
    // Same with shorthand notation
    println(listOfNumbers.filter(_ % 3 == 0).mkString(" "))
    
  }

}
