import Task.Task

object UI {

  def printToDoList()= {
    UIBuilder.newPage("To Do List")

    for ((task, taskIndex) <- ToDoState.taskList().zipWithIndex) {
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
