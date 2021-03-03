abstract class Vehicle {
}


trait FourWheeler {
}


trait Car {
  /**
    * The statement below means that when a class extends Car it is also
    * mandatory to extend FourWheeler and Vehicle as well.
    */

  this: FourWheeler with Vehicle => {

  }
}


class Mercedes extends Vehicle with FourWheeler with Car {
}


object DemoDTraits {

  def main(args: Array[String]): Unit = {

    val mercedes = new Mercedes()
    
  }

}
