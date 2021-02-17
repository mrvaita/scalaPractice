// Program 2: Singleton object
object DemoObjectB {
  val x = 2
  val y = 5.5

  def addValue() = x + y

  println(s"x = ${x}, y = ${y}")
}


object SingletonDemoA {

  def main(args: Array[String]): Unit = {
    
    // val demoObjectB1 = new DemoObjectB  // It gives error. Cannot create instance of object
    println(DemoObjectB.x, DemoObjectB.y)  // Access object variable as onjectName.variableName
    
    val result = DemoObjectB.addValue()  // Access method/function as objectName.methodName
    println(result)
  }

}
