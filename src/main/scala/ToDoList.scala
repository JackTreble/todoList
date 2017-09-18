
object ToDoList {

  def main(args: Array[String]) {
    ToDoState.loadState(Option.empty)



    while (true){
      UI.printToDoList()
      Command.command()
      ToDoState.saveState(Option.empty)
    }
  }



}
