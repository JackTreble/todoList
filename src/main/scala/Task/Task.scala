package Task

case class Task (title : String, description : String, subTasks : List[SubTask] = List(), complete : Boolean = false) extends ToDo {

  def completeTask: Task = {
    copy(complete = true)
  }

  def addSubtask(subTask : SubTask): Task = {
    copy(subTasks = subTask +: subTasks)
  }
}


