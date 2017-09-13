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

  def actions(input : Array[String]) = input match {
    case Array("quit") => Actions.quit()
    case Array("add", _, _) => Actions.add()
    case Array(_) => println("Error: Action Not Defined.")
  }

  def takeInput(): String ={
    StdIn.readLine();
  }

  def parseRawInput(rawInput : String): Array[String] = rawInput.split("[^\" ]+|(\"[^\"]*\")")


  def actionCommand() = {
    val rawInput =  takeInput
    val parsedInput = parseRawInput(rawInput)
    actions(parsedInput)
  }
}
