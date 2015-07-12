package uni

sealed trait FieldNode {
  def render(readOnly: Boolean, values: Map[String, Any]): String
}

sealed trait Field extends FieldNode { }

case class StringField() extends Field {
  def render(readOnly: Boolean, values: Map[String, Any]): String = "hello"
}

case class Form(rootNode: FieldNode) {

}
