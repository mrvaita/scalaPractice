object DemoPNestedFunctions {

  def main(args: Array[String]): Unit = {

    printHello("World")
    printHello("Italy")
  }

  def printHello(str:String): Unit = {
    
    def printSomething(str1:String, str2:String): Unit = {
      printSomethingElse(s"$str1 $str2")

      def printSomethingElse(finalString:String): Unit = {
        println(finalString)
      }
    }

    printSomething("Hello", str)
  }

}
