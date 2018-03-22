object Test {
  def main(args: Array[String]) = {

    var someVar = true

    var anotherVar = false

    if(someVar && !anotherVar)
      println("yay")
    
    import scala.concurrent.Future

    val a = Future.successful("a")
  }
}
