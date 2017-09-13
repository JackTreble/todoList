
case class ToDoState(username: String, toDoList: List[Task] = List()) {

  protected def addTask(task: Task): ToDoState = {
    copy(toDoList = task +: toDoList)
  }

  protected def deleteTask(taskIndex: Int): ToDoState = {
    copy()
  }

  protected def completeTask(taskIndex: Int): ToDoState = {
    copy()
  }
}

object ToDoState {
  var toDoState = ToDoState(username = "")

  def addTask(task: Task) = {
    toDoState = toDoState.addTask(task)
  }

  def deleteTask(taskIndex: Int) = {
    toDoState = toDoState.deleteTask(taskIndex)
  }

  def completeTask(taskIndex: Int) = {
    toDoState = toDoState.completeTask(taskIndex)
  }
}