/**
 * Created by alexreinking on 10/31/14.
 */

object HelloScala extends App {
  val helloObj = new HelloJava
  helloObj.hello()
}

class HelloScala {
  def hello (): Unit = {
    println("Hello from Scala!")
  }
}
