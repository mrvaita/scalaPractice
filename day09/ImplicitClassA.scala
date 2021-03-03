object ImplicitClassA {
  /**
    * `implicit` modifier cannot be used for top-level objects
    */

  implicit class StringFuncClass(s:String) {
    /**
      * This way the function `firstChar` can be used with strings like if it
      * was a member of the String class
      */

    def firstChar() = s.substring(0, 1)

  }

  def main(args: Array[String]): Unit = {

    val strr = "Hello World"
    println(strr.firstChar())

  }

}
