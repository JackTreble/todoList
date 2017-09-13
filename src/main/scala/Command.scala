import scala.io.StdIn

/**
  * Current Implementation:
  * Action must have all parameters
  * add "Title" "Desc"
  *
  * Future Implementation:
  * Actions parameters are optional
  * add -t "Title" --Description "Desc"
  *
  * Notes:
  * Implement Action Monad
  *
  */
object Command {

  def actionCommand(input : Array[String]) = input match {
    case Array("quit") => Actions.quit
    case Array("add", _, _) => Actions.add(input(1),input(2))
    case Array("delete", _) => Actions.delete(input(1).toInt)
    case Array("complete", _) => Actions.complete(input(1).toInt)
    case Array(_) => println("Error: Action Not Defined.")
  }

  def takeInput(): String ={
    StdIn.readLine();
  }

  def parseRawInput(rawInput : String): Array[String] = rawInput.split(" ")


  def command() = {
    val rawInput =  takeInput
    val parsedInput = parseRawInput(rawInput)
    actionCommand(parsedInput)
  }
}
