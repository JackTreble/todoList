object UIBuilder {

  val stringBuilder = new StringBuilder()

  def newPage(title: String) = {
    stringBuilder.clear()
    stringBuilder.append(sys.props("line.separator"))
    addTitle(title)
  }

  def addTitle(title: String) = {
    add('═' +title)
  }

  def add(content : String ) = {
    newLineAppend(content)
  }

  def newLineAppend(value : String) = {
    stringBuilder.append(value)
    stringBuilder.append(sys.props("line.separator"))
  }

  def printPage() = {
    println(stringBuilder.toString())
  }

}
