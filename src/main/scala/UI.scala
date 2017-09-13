object UI {

  def printWelcome() = {
    UIBuilder.newPage("Welcome")
    UIBuilder.printPage()
  }

  def printToDoList()= {
    UIBuilder.newPage("To Do List")

    for ((task, taskIndex) <- ToDoState.toDoState.toDoList.zipWithIndex) {
      UIBuilder.add(taskIndex + ", " + task.title)
      UIBuilder.add("--" + task.description)
    }

    UIBuilder.printPage()
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
