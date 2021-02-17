/**
  * for a complete list of all RegEx functions in scala see
  * https://www.scala-lang.org/api/current/scala/util/matching/Regex.html
  * and for examples see
  * https://docs.scala-lang.org/tour/regular-expression-patterns.html
  */

import scala.util.matching.Regex


object RegularExpressionA {

  def main(args: Array[String]): Unit = {
    // example 1
    println("Example 1:")
    var pattern = new Regex("Hello")
    var stringToFind = "Hello how are you? Hello again"
    println(pattern.findFirstIn(stringToFind).mkString)  // mkString makes a string out of the output
    println(pattern.findAllIn(stringToFind).mkString(", "))  // ", " generates a comma separated output

    // example 2
    println("Example 2:")
    stringToFind = "Hello how are you? hello again"
    pattern = new Regex("(H|h)ello")
    println(pattern.findAllIn(stringToFind).mkString(", "))  // ", " generates a comma separated output

    // example 3
    println("Example 3:")
    stringToFind = "My name is Michele and oge is 10 and I study in standard 7"
    pattern = "[0-9]+".r  // Find all numbers (from 0 to 9). `+` means one or more matches
    println(pattern.findAllIn(stringToFind).mkString(", "))

    // example 4 (getOrElse does something if the result is None)
    println("Example 4:")
    pattern = new Regex("Hellooooo")
    stringToFind = "Hello how are you? Hello again"
    println(pattern.findFirstIn(stringToFind).getOrElse("No match found").mkString)

    // example 5
    println("Example 5:")
    pattern = new Regex("(H|h)ello")
    stringToFind = "Hello how are you? hello again"
    pattern.findAllIn(stringToFind).foreach(d => println(d))  // foreach does something for eahc of the matches found (in this case print)

    // example 6
    // Searching for abl, fourth char shold be a or e, the fifth char can be
    // one or more digits (\\d+). It should only find `able0`
    println("Example 6:")
    stringToFind = "Hello I am Able to do it, abl11 able able0"
    pattern = "abl[ae]\\d+".r
    println(pattern.findAllIn(stringToFind).mkString(", "))
    
    // example 7
    // Searching for abl, fourth char shold be a or e, the fifth char can be
    // zero or more digits (\\d*). It should only find `able` and `able0`
    println("Example 7:")
    stringToFind = "Hello I am Able to do it, abl11 able able0"
    pattern = "abl[ae]\\d*".r
    println(pattern.findAllIn(stringToFind).mkString(", "))

    // example 8
    // First char is - but is optional to find (?). Second char is one or more
    // digits. Third char is a . followed by 0 or more digit (the digits are
    // optional). It should find -1.5, 5 and 3
    println("Example 8:")
    pattern = "(-)?(\\d+)(\\.\\d*)?".r
    stringToFind = "-1.5 divide by 5 is 3 is wrong"
    println(pattern.findAllIn(stringToFind).mkString(", "))

    //example 9
    println("Example 9:")
    val Decimal = """(-)?(\d+)(\.\d*)?""".r
    // val Decimal(sign, integerpart, decimalpart) = "-1.23"
    stringToFind = "-1.5 divide by 5 is 3 is wrong"
    for (Decimal(sign, integerpart, decimalpart) <- Decimal.findAllIn(stringToFind))
      println(s"Sign is $sign, Integer Part is $integerpart, Decimal Part is $decimalpart")

  }

}
