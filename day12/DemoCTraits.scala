abstract class Vehicle {
  /** abstract classes are similar to traits
    */

  def category(): Unit

}


trait FourWheeler {
  
  def tires(): Unit = {
    println("FourWheeler has four tires")
  }

}


trait Car {

  var cc = 1000
  val t = 4

  def engine(): Unit = {
    println(s"Engine is $cc cc. in a Car")
  }

  def breaks(): Unit

  def tires(): Unit = {
    println(s"Car has $t tires")
  }

}


class Mercedes extends Vehicle with FourWheeler with Car {

  cc = 2000  // I am using the one from Car!!!
  override val t = 6  // I can also override val from parent trait

  def breaks(): Unit = {
    println("Disk breaks in Mercedes")
  }

  override def tires(): Unit = super.tires()

  // MUST be defined because in the Vehicle abstract class there is no body of
  // that method.
  def category(): Unit = {
    println("It is a Mercedes")
  }

  // Methods of traits can be overridden as with standard class methods
  override def engine(): Unit = {
    println(s"Engine of Mercedes is $cc cc")
  }

}


object DemoCTraits {

  def main(args: Array[String]): Unit = {

    val mercedes = new Mercedes()
    mercedes.breaks()
    mercedes.tires()
    mercedes.engine()
    mercedes.category()
    
  }

}
