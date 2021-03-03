trait Car {

  def engine(): Unit = {
    println("Engine is 1000 cc.")
  }

  // methods with no body have to be implemented in the child class!!!
  def breaks(): Unit

  def tires(): Unit

}

class Mercedes extends Car {
  /** The two methods below MUST be implemented because they have no body in
    * the parent trait
    * If you don't implement one of the methods you will get the following
    * error: `error: class Mercedes needs to be abstract. Missing
    * implementation for: def tires(): Unit // inherited from trait Car`
    */

  def breaks(): Unit = {
    println("Disk breaks")
  }

  def tires(): Unit = {
    println("Four tires")
  }

}

object DemoATraits {

  def main(args: Array[String]): Unit = {

    val mercedes = new Mercedes()
    mercedes.breaks()
    mercedes.tires()
    mercedes.engine()
    
  }

}
