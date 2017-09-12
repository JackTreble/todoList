import scala.io.StdIn
object Command {

  def actions(input : Array[String]) = input match {
    case Array("quit") => Actions.quit()
    case Array("add", _) => Actions.add()
    case Array(_) => println("Error: Action Not Defined.")
  }

  def takeInput(): String ={
    StdIn.readLine();
  }

  def parseRawInput(rawInput : String): Array[String] = rawInput.split("[^\" ]+|(\"[^\"]*\")")


  def actionCommand(): Unit = {
    val rawInput =  takeInput
    val parsedInput = parseRawInput(rawInput)

  }
}
