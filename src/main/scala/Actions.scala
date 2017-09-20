import tasks.Task
import states.ToDoState

object Actions {

  def add(title: String, description: String) = {
    ToDoState.addTask(new Task(title, description))
  }

  def delete(taskIndex : Int) = {
    ToDoState.deleteTask(taskIndex)
  }

  def complete(taskIndex : Int) = {
    ToDoState.completeTask(taskIndex)
  }

  def quit() = {
    System.exit(0)
  }
}
