import java.util.Date

object DemoNPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
    var date = new Date()
    // The one below is a partially applied function. Like when you use the
    // Patial function in python. Now to use this function you just need to
    // pass the string message.
    // NOTE: It does not make so much sense because all the log messages will
    // be saved with the same date.
    val logWithDate = log(date, _:String)

    log(date, "Log message 1 ")
    logWithDate("Log with date message 1 ")

    Thread.sleep(2000)
    log(date, "Log message 2 ")
    logWithDate("Log with date message 2 ")

    Thread.sleep(2000)
    log(date, "Log message 3")
    logWithDate("Log with date message 3 ")

  }

  def log(date: Date, msg: String): Unit ={
    println(msg + date)
  }
}
