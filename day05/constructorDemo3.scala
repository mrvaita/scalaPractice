// Program 4: Auxiliary constructors

class demoClass3(val a:Int, val b:Double, val c:String) {
  val x = a
  val y = b
  val z = c

  println(s"Primary constructor says: x = ${x}, y = ${y} and z = ${z}")

  def addNumber() = {
    x + y
  }

  def this() = {
    /**
      * That is how auxiliary constructors are defined
      */

    this(99, 88.88, "Hello Scala")
    println("I came into the Auxiliary constructor with 0 parameters")
  }

  def this(a:Int) = {

    this(a, 88.88, "Hello Scala")
    println("I came into the Auxiliary constructor with 1 parameters")
  }

  def this(a:Int, b:Double) = {

    this(a, b, "Hello Scala")
    println("I came into the Auxiliary constructor with 2 parameters")
  }

}


object constructorDemo3 {

  def main(args: Array[String]): Unit = {

    val demoObject1 = new demoClass3(5, 7.2, "Hello World!")
    val demoObject2 = new demoClass3()  // Not passing values will trigger the auxiliary constructor
    val demoObject3 = new demoClass3(7)
    val demoObject4 = new demoClass3(7, 2.2)

  }

}
