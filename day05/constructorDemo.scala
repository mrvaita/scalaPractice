// Program 1

class demoClass {
  val x = 3
  val y = 2

  def addNumber() = {
    x + y
  }

  println(s"x = ${x} and y = ${y}")

  val z = addNumber()
  println(s"z = ${z}")
}


object constructorDemo {

  def main(args: Array[String]): Unit = {

    val demoObject1 = new demoClass  // at the stage the constructor is called and it will execute everything in the class

  }
}
