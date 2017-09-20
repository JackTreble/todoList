package tasks

import tasks.traits.ToDo

case class SubTask(title : String, description : String, complete : Boolean) extends ToDo {
  def completeTask: SubTask = {
    copy(complete = true)
  }
}
