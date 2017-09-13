
object Actions {

  def add(title: String, description: String) = {
    ToDoState.addTask(new Task(title, description))
  }

  def delete() = {
    ToDoState.deleteTask(1)
  }

  def complete() = {
    ToDoState.completeTask(1)
  }

  def quit() = {
    System.exit(0)
  }
}
