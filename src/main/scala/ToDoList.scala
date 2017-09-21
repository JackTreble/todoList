import actions.QuitAction
import actions.traits.Action
import states.{SettingsState, ToDoState}

object ToDoList {

  def main(args: Array[String]) {
    SettingsState.loadState(Option.empty)
    ToDoState.loadState(Option.empty)




    var action: Action;
    do {

      action = new QuitAction
    } until((!action.isInstanceOf[QuitAction])
    //print
    //take input
    //process input
    while (true){
      UI.printToDoList()
      Command.command()
      ToDoState.saveState(Option.empty)
    }
  }



}
