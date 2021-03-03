import scala.util.control.Exception.catching


object DemoCCatching {

  def main(args: Array[String]): Unit = {

    // catching accepts Arrays as argument as well
    // catching([calssOf[ArithmeticException], classOf[...], ...])
    val catchExceptions = catching(classOf[ArithmeticException]).withApply(e => println(s"Arithmetic exception had occurred: $e"))
    
    val a = catchExceptions(10 / 0)

    if (a != ()) {
      println(a)
    }

  }

}
