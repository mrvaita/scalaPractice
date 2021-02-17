// Program 2: Parametrized constructor

class demoClass1(val a:Int, val b:Double, val c:String) {
  val x = a
  val y = b
  val z = c

  def addNumber() = {
    x + y
  }

  println(s"x = ${x}, y = ${y} and z = ${z}")

}


object constructorDemo1 {

  def main(args: Array[String]): Unit = {

    val demoObject1 = new demoClass1(5, 7.2, "Hello World!")
    val demoObject2 = new demoClass1(6, 8.3, "Hello World Again!")

    var result = demoObject1.addNumber()
    println(s"result = ${result}")

    result = demoObject2.addNumber()
    println(s"result = ${result}")

  }
}
