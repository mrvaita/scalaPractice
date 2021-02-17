// Multi dimensional Arrays
import scala.collection.mutable.ArrayBuffer


object DemoHArrays {

  def main(args: Array[String]): Unit = {

    // Adding elements to an Array
    var marks = ArrayBuffer[Int]()  // No need to specify legth

    marks += 1
    marks += 5
    marks += 9
    marks += 1

    println(s"marks so far: ${marks.mkString(" ")}")

    marks += 7
    marks += 9

    println(s"marks so far: ${marks.mkString(" ")}")

    // removing elements (it removes the first occurrence starting from left)
    marks -= 9

    println(s"marks so far: ${marks.mkString(" ")}")
  
  }

}
