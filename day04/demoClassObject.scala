class Car {
  var topClassExtraCost = 0
  private var roadTax = 100

  def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

  def checkTax() = {
    /**
      * in case a variable is private, I can always generate a method to make
      * it value visible ouside the class
      */

    // changing roadTax value inside this method will affect the value of the
    // variable permanently. There is one and only one `roadTax` variable!!!
    roadTax
  }
}

object demoClassObject {

  def main(args: Array[String]): Unit = {

    println("hello abc")

    var bmw = new Car
    bmw.topClassExtraCost = 500

    println("Road tax is: " + bmw.checkTax())

    var result = bmw.cost(basicCost=10000)
    println("Total cost of car is: " + result)

  }
}
