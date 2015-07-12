package uni

trait Api{
  def getForm(id: String, recordId: String): (Form, Map[String, String])

}

