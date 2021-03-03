// Multi dimensional Arrays
import Array._


object DemoFArrays {

  def main(args: Array[String]): Unit = {
    var marks1 = Array(5, 6, 8, 9, 2, 4, 6)
    var marks2 = Array(5, 9, 2, 6, 4, 2, 6)
    
    // concatenate two 1Darrays into a bigger 1DArray
    var allMarks = concat(marks1, marks2)
    println(allMarks.mkString(" "))

    // define Array with range
    var myRange = range(1, 100, 2)  // 1=start, 100=end (not included), 2=step
    println(myRange.mkString(" "))
  }

}
