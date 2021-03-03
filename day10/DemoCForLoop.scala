import scala.util.control.Breaks

object DemoCForLoop {

  def main(args: Array[String]): Unit = {

    // It will include 10 in the loop
    for (i <- 1 to 10) {
      println(s"Value of i is $i")
    }

    // It will not include 10 in the loop
    for (i <- 1 until 10) {
      println(s"Value of i is $i")
    }

    // Nested for loops
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(s"Value of i is $i, value of j is $j")
      }
    }

    // Nested for loop in Scala (concise syntax)
    for (i <- 1 to 3; j <- 1 to 3) {
      println(s"Value of i is $i, value of j is $j")
    }

    println("===============For loop for Collections===============")
    // Lists are similar to Arrays. Difference is that Lists are IMMUTABLE
    var numberList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- numberList) {
      println(s"Value of List item i is $i")
    }

    // Loop with filter (Only even numbers)
    for (i <- numberList if i % 2 == 0) {
      println(s"Value of List item i is $i")
    }

    // Loop with filter (Only even numbers and not 4)
    for (i <- numberList if i % 2 == 0; if i != 4) {
      println(s"Value of List item i is $i")
    }

    // Loop with filter with YIELD (similar to python list comprehention)
    var evenNumberList = for (i <- numberList if i % 2 == 0) yield i
    println(evenNumberList.mkString(", "))

    println("===============break statement===============")
    // Break is not a keyword but an object. An instance of Breaks has to be
    // created and the for loop goes inside it if you want to break your loop
    // at some point.
    val breakObject = new Breaks;

    breakObject.breakable {
      for (i <- numberList if i % 2 == 0) {
        println(s"Value of List item i is $i")
        if (i == 4) {
          println("I am breaking at 4")
          breakObject.break
        }
      }
    }

  }

}
