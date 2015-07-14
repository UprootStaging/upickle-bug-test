package uni

import scala.concurrent.ExecutionContext.Implicits.global

class UniServlet {
  def handlePost() = {
    val s = Seq("")
    val e = ""

    // This also fails, but with a different error.
    // upickle.default.read[uni.Form]("{}")

    val result = upickle.default.read[(uni.Form, Map[String, String])]("{}")

    println(result)
  }

}
