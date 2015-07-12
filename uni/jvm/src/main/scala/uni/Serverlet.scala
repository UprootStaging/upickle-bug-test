package uni

import scala.concurrent.ExecutionContext.Implicits.global

class UniServlet {
  def handlePost() = {
    val s = Seq("")
    val e = ""

    val result = AutowireServer.route[Api](UniServer)(
      autowire.Core.Request(s, upickle.default.read[Map[String, String]](e))
    )

    println(result)

  }

}
