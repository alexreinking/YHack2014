/**
 * Created by alexreinking on 10/31/14.
 */

object HelloScala extends App {
  override def main (args: Array[String]): Unit = {
    val helloObj = new HelloJava
    helloObj.hello()
  }
}

class HelloScala {
  def hello (): Unit = {
    println("Hello from Scala!")
  }
}
