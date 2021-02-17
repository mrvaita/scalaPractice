object DemoAArrays {

  def main(args: Array[String]): Unit = {

    // Array declaration. Empty Array on length 3. Since it is an integer the
    // Array will be initialized with all zeros
    var num:Array[Int] = new Array[Int](3)

    // Concise initialization
    var num2 = new Array[Int](3)

    // Adding values to array
    num(0) = 25
    num(1) = 35
    num(2) = 50
  }
}
