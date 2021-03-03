object DemoBWhileLoop {
  
  def main(args: Array[String]): Unit = {

    var x = 1

    // The condition will be checked at the start
    while (x < 10) {
      println(s"Value of x from while loop is $x")
      x += 1
    }
    
    // do while will always execute the first iteration even if x is greater
    // than 10. The condition is checked at the end
    x = 1
    do {
      println(s"Value of x from do-while loop is $x")
      x = x + 1
    } while (x < 10)

  }
}
