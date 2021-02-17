object DemoAArrays {

  def main(args: Array[String]): Unit = {

    var marks = Array(58, 36, 98, 18, 56, 45, 95, 37, 76, 82, 19, 2, 100)

    for (mark <- marks) {
      println(mark)
    }

    // Average marks
    var totalMarks = 0
    var averageMarks = 0

    for (mark <- marks) {
      totalMarks = totalMarks + mark
    }
    averageMarks = totalMarks / marks.length
    println(s"Average Marks is: $averageMarks")
    
    /** Same as above but with loop through array range of array indexes
      * for (i <- 0 to (marks.length - 1)) {
      *   totalMarks = totalMarks + marks(i)
      * }
      */


  }

}
