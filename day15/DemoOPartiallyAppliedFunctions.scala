import java.util.Date

object DemoOPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {

    fourWheeler("Mercedes", "Car", 20000)
    car("FIAT", 15000)
    truck("Scania", 50000)

  }

  // Classic Function
  //def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
  //  println(s"Vehicle name is $vehicleName, vehicle type is $vehicleType, vehicle cost is $vehicleCost")
  //}

  // Same way to implement it
  val fourWheeler = (vehicleName:String, vehicleType:String, vehicleCost:Int) => {
    println(s"Vehicle name is $vehicleName, vehicle type is $vehicleType, vehicle cost is $vehicleCost")
  }

  // Partial functions
  val car = fourWheeler(_:String, "Car", _:Int)
  val truck = fourWheeler(_:String, "Truck", _:Int)
}
