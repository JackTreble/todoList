import Task.Task


case class ToDoState(username: String, toDoList: List[Task] = List()) {

  protected def addTask(task: Task): ToDoState = {
    copy(toDoList = task +: toDoList)
  }

  //TODO
  protected def deleteTask(taskIndex: Int): ToDoState = {


    toDoList.apply(taskIndex)
    copy()
  }

  //TODO
  protected def completeTask(taskIndex: Int): ToDoState = {
    toDoList.apply(taskIndex)
    copy()
  }
}

object ToDoState extends StateJsonSerializer {
  private var toDoState = ToDoState(username = "")

  def addTask(task: Task) = {
    toDoState = toDoState.addTask(task)
  }

  def deleteTask(taskIndex: Int) = {
    toDoState = toDoState.deleteTask(taskIndex)
  }

  def completeTask(taskIndex: Int) = {
    toDoState = toDoState.completeTask(taskIndex)
  }

  def taskList(): List[Task] = {
    toDoState.toDoList
  }

  implicit val defaultFileName = "todoState"

  override def saveState(fileName: Option[String] = None) = {
    doSaveState(fileName, toDoState)
  }

  override def loadState(fileName: Option[String] = None) = {
    toDoState = doLoadState[ToDoState](fileName).getOrElse(toDoState)
  }
}