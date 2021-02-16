trait Car extends Any {

  def print(): Unit = {
    println(this)
  }

}


// Mercedes is a value class (it extends AnyVal)
// A VALUE CLASS cannot allocate runtime object
// A VALUE CLASS has ONLY ONE parameter with type `val`
// A VALUE CLASS cannot be extended
// A VALUE CLASS cannot extend a trait. That is why you have UNIVERSAL TRAITS.
// You cannot define a variable in a value class
// You can only define methods in a value class
class Mercedes(val x:Int) extends AnyVal with Car {

  def hello(): Unit = {
    println("Hello")
  }

}


object DemoETraits {

  def main(args: Array[String]): Unit = {

    val mercedes = new Mercedes(5)
    mercedes.print()

  }

}
