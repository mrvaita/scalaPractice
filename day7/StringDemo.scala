object StringDemoA {

  def main(args: Array[String]): Unit = {
    var greetings = "Hello World!"
    println(greetings)

    var greetingsNew:String = "Hello Utaly!"  // Data type defined
    println(greetingsNew)

    // get length of the string
    var lengthOfString = greetings.length()
    println(s"The length of the string is ${lengthOfString}")

    // concat method ( + or concat() )
    var var1 = "Hello "
    var var2 = "World"
    println(var1 + var2)
    println(var1.concat(var2))

    // get character at given index
    println(var2.charAt(1))

    // equals method
    var varA = "Hello World!"
    var varB = "Hello World!"
    println(varA.equals(varB))
    println(varA == varB) // Same as equals but first checks whether varA and varB are either null or not null

    // String formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 100000
    var milageOfCar = 8.5
    printf("Name of Car is %s and cost of Car is %d and milage of Car is %f", nameOfCar, costOfCar, milageOfCar)  // %s, String; %d, Int; %f, Float

    // Multi Line Strings
    var multiLineString = 
      """Hello
        |World
        |How
        |are
        |you
      """.stripMargin
    println(multiLineString)
    
    // String interpolation
    // 1. 's' String Interpolator
    var name = "Michele"
    println(s"Hello $name")
    // 2. 'f' Interpolator (Not much used)
    name = "Michele"
    var salary = 2000.2
    println(f"Name is $name%s and salary is $salary%8.2f")
    // 3. raw Interpolator - Same as `s` interpolator but it does not perform
    //    escaping
    println(s"Hello World!\nHow are you?")
    println(raw"Hello World!\nHow are you?")


  }

}
