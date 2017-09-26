import actions.QuitAction
import actions.traits.Action
import states.{ProgramState, SettingsState, ToDoState}

object ToDoList {

  def main(args: Array[String]) {
    SettingsState.loadState(Option.empty)
    ToDoState.loadState(Option.empty)
    //Print Welcome
    do {
      UI.printToDoList()
      Command.command()
      ToDoState.saveState(Option.empty)
    } while(!ProgramState.isQuiting)
    //Print Goodbye
  }



}
