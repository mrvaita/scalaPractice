// Program 3: Default parameters in constructor

class demoClass2(val a:Int = 99, val b:Double = 88.88, val c:String = "Hello Scala") {
  val x = a
  val y = b
  val z = c

  def addNumber() = {
    x + y
  }

  println(s"x = ${x}, y = ${y} and z = ${z}")

}


object constructorDemo2 {

  def main(args: Array[String]): Unit = {

    val demoObject1 = new demoClass2(5, 7.2, "Hello World!")
    val demoObject2 = new demoClass2()
    val demoObject3 = new demoClass2(25)  // it will be passed to the first parameter of the constructor
    val demoObject4 = new demoClass2(c = "Hello")  // it will be passed to the `c` parameter of the constructor
    val demoObject5 = new demoClass2(c = "Hello", a = 5, b = 6.6)  // If parameter names are specified the order does not matter
    val demoObject6 = new demoClass2(a = 3, b = 3.1, "Hello")  // That will work

  }

}
