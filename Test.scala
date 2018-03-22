object Test {
  def main(args: Array[String]) = {

    var someVar = true

    var anotherVar = false

    if(someVar && !anotherVar)
      println("yay")
    
    import scala.concurrent.Future

    val a = Future.successful("a")
  }

  def badF() = {
    
    var a = 1
    
    val b = 2
    
    import scala.concurrent.Future
    ()
  }
}
