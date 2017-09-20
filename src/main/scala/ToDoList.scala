import states.{SettingsState, ToDoState}

object ToDoList {

  def main(args: Array[String]) {
    SettingsState.loadState(Option.empty)
    ToDoState.loadState(Option.empty)


    while (true){
      UI.printToDoList()
      Command.command()
      ToDoState.saveState(Option.empty)
    }
  }



}
