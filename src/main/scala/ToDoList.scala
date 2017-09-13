
object ToDoList {

  def main(args: Array[String]) {
    UI.printToDoList()
    while (true){
      Command.command()
      UI.printToDoList()
    }
  }



}
