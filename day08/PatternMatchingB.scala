case class Car(name: String, cost: Int)

object PatternMatchingDemo {

  def main(args: Array[String]): Unit = {

    val mercedes = Car("Mercedes", 10000)
    val bmw = Car("BMW", 20000)
    val jaguar = Car("Jaguar", 50000)

    for (car <- List(mercedes, bmw, jaguar)) {
      car match {
        case Car("Mercedes", 10000) => println("Car is Mercedes!")
        case Car("BMW", 20000) => println("Car is Mercedes!")
        case Car(name, cost) => println(s"Car is ${name}, Cost is ${cost}!")
      }
    }

  }

}
