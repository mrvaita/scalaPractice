// Multi dimensional Arrays
import Array._


object DemoGArrays {

  def main(args: Array[String]): Unit = {

    var marks1 = Array(5, 6, 8)
    var marks2 = Array(5, 9, 2)
    var marks3 = Array(5, 9, 2)
    
    // Combining 3 Arrays into an Array of Arrays
    var marks = Array(marks1, marks2, marks3)
    marks.foreach(row => println(row.mkString(" ")))

  }

}
