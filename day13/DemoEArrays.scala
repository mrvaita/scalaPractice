// Multi dimensional Arrays
import Array._


object DemoEArrays {

  def main(args: Array[String]): Unit = {

    var array2d = ofDim[Int](3, 3)

    for (row <- 0 to 2) {
      for (col <- 0 to 2) {
        array2d(row)(col) = col + 3
      }
    }

    // 5x5 identity matrix
    var idMatrix = ofDim[Int](5, 5)

    for (row <- 0 to 4) {
      for (col <- 0 to 4) {
        if (row == col) {
          idMatrix(row)(col) = 1
        } else {
          idMatrix(row)(col) = 0
        }
      }
    }

    printMatrix(array2d, List(3, 3))
    printMatrix(idMatrix, List(5, 5))

    def printMatrix(matrix: Array[Array[Int]], matrixDim: List[Int]): Unit = {
      for (row <- 0 until matrixDim(0)) {
        for (col <- 0 until matrixDim(1)) {
          if (col == matrixDim(1) - 1) {
            println(s"${matrix(row)(col)}")
          } else {
            print(s"${matrix(row)(col)} ")
          }
        }
      }
    }

    // Much easier and scalonic way to print matrix
    array2d.foreach(row => println(row.mkString(" ")))
    idMatrix.foreach(row => println(row.mkString(" ")))
  }

}
