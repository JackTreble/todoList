object UI {

  def printWelcome() = {
    UIBuilder.newPage("Welcome")
    UIBuilder.printPage()
  }

  def printToDoList(toDoSate : ToDoState): Unit ={
    UIBuilder.newPage("To Do List")
   // toDoSate.toDoList.
  }

  def printTask(task : Task): Unit ={
    UIBuilder.newPage("To Do List")
    // toDoSate.toDoList.
  }

  def printHelp(toDoSate : ToDoState): Unit ={
    UIBuilder.newPage("Help")
    // toDoSate.toDoList.
  }

}
