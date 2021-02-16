import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


object DemoATryCatch {
  
  def main(args: Array[String]): Unit = {

    try {
      val f = new FileReader("input.txt")
    } catch {
      case e: FileNotFoundException => {
        // Errors has to be logged into some file.
        println(s"File not Found - Exception Received. $e")  // I can also pass the exception to get some insights about the error.
      }
      case e: IOException => {
        println("Error while reading file = Exception Received")
      }
    } finally {
      // For example here you can close the file after you opened it
      println("It will always be executed no matter whether there is an exception or not")
    }

    try {
      val a = 10 / 0
    } catch {
      case e: ArithmeticException => {  // No need to import this because in scala java/lang._ is automatically imported
        println("Arithmetic Exception Received")
      }
    }

    try {
      val array1 = Array(10)
      println(array1(11))  // I try to print the 11th element of the array. It throws java.lang.ArrayIndexOutOfBoundsException
    } catch {
      case _: Exception => {  // the _ here is not mandatory. You can put whatever you like
        println("This will handle all the exceptions. Not good practice!")
      }
    }
  
  }

}
