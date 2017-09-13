object UIBuilder {

  val stringBuilder = new StringBuilder()
  val uiWidth = 70
  val uiContentWidth = uiWidth - 2

  def newPage(title: String) = {
    stringBuilder.clear()
    stringBuilder.append(sys.props("line.separator"))
    buildHeader(title)
  }

  def buildHeader(title: String) = {
    newLineAppend("╔" + generateLine() + "╗") // make this depend on uiWidth
    add(title)
    newLineAppend("╠" + generateLine() + "╣") // make this depend on uiWidth
  }

  def add(content : String ) = {
    newLineAppend(String.format("║%1$-" + uiContentWidth + "s║", content))
  }

  def newLineAppend(value : String) = {
    stringBuilder.append(value)
    stringBuilder.append(sys.props("line.separator"))
  }

  def endPage() = {
    newLineAppend("╚" + generateLine() + "╝") // make this depend on uiWidth
  }

  def generateLine(): String = (for (i <- 1 to uiContentWidth) yield '═').mkString

  def printPage() = {
    endPage()
    println(stringBuilder.toString())
  }

}
