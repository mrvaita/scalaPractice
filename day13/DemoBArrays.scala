object DemoBArrays {

  def main(args: Array[String]): Unit = {

    var marks = Array(58, 36, 98, 18, 56, 45, 95, 37, 76, 82, 19, 2, 100)

    for (mark <- marks) {
      println(mark)
    }

    // Same as for loop above but more concise
    marks.foreach(mark => println(mark))
    // marks.foreach(println())  // that would also work

    // foreach
    var totalMarks = 0
    marks.foreach(mark => totalMarks += mark)
    // marks.foreach(totalMarks += mark)  // that would work as well. But a bit confusing
    val averageMarks = totalMarks / marks.length
    println(s"Average Marks is: $averageMarks")

    // map
    var newMarks = marks.map(mark => mark + 10)  // Adds 10 to each element
    newMarks.foreach(mark => println(mark))

  }

}
