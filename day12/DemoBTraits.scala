trait FourWheeler {
  
  def tires(): Unit = {
    println("FourWheeler has four tires")
  }

}


trait Car {

  def engine(): Unit = {
    println("Engine is 1000 cc. in a Car")
  }

  def breaks(): Unit

  def tires(): Unit = {
    println("Car has four tires")
  }

}


class Mercedes extends FourWheeler with Car {

  def breaks(): Unit = {
    println("Disk breaks in Mercedes")
  }

  // In case a method is present in both parent traits it has to be defined as
  // following in order to be used in the child class. However, only the method
  // from the last extended trait will be used (in this case `Car`).
  override def tires(): Unit = super.tires()

}


object DemoBTraits {

  def main(args: Array[String]): Unit = {

    val mercedes = new Mercedes()
    mercedes.breaks()
    mercedes.tires()
    mercedes.engine()
    
  }

}
