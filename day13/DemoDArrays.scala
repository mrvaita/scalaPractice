object DemoDArrays {

  def main(args: Array[String]): Unit = {

    // reduceRight
    var marks = Array(21.0, 25.0, 39.0, 58.0, 79.0, 64.0, 52.0, 94.0, 34.0)
    var avg = marks.reduceRight((x, y) => (x + y) / 2 )

    // Same as above but with intermediate output of x and y
    var avg2 = marks.reduceRight((x, y) => {
      println(s"Value of x is $x and value of y is $y. Average is ${(x+y)/2}")
      (x + y) / 2
    })
    
    // Shorthand notation (in the end the name of the variable does not
    // matter. It can just be `_`)
    var avg3 = marks.reduceRight(_/2 + _/2)

    // Output results
    // This is not a real average. It is just an operation with numbers.
    println(s"avg is $avg")
    println(s"avg2 is $avg2")
    println(s"avg3 is $avg3")

    // More examples
    var totalMarks = marks.reduceRight(_ + _)
    println(s"Total Marks is $totalMarks")

    var maxMarks = marks.reduceRight(_ max _)
    println(s"Maximun Marks is $maxMarks")

    var minMarks = marks.reduceRight(_ min _)
    println(s"Minimum Marks is $minMarks")

  }

}
