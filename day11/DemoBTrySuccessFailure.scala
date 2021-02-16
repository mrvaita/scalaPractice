import scala.util.Try
import scala.util.Success
import scala.util.Failure


object DemoBTrySuccessFailure {

  def main(args: Array[String]): Unit = {
    val a = Try (10 / 0)

    a match {
      case Success(value) => println(value)  // Simply print the value in case the operation succeeds
      case Failure(exception) => errorHandlingFunction(exception)
    }
  }

  def errorHandlingFunction(exception: Throwable): Unit = {
    /**
      * It is possible to define functions to support exception handling
      */

    println(exception.toString)
    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println("Hello, arithmetic exception had occurred")
    }
  }

}
