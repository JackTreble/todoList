import Task.Task


case class ToDoState(username: String, toDoList: List[Task] = List()) {

  protected def addTask(task: Task): ToDoState = {
    copy(toDoList = task +: toDoList)
  }

  protected def deleteTask(taskIndex: Int): ToDoState = {


    toDoList.apply(taskIndex)
    copy()
  }

  protected def completeTask(taskIndex: Int): ToDoState = {
    toDoList.apply(taskIndex)
    copy()
  }
}

object ToDoState extends StateParser {
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
  implicit val est = ToDoState

  override def saveState(fileName: Option[String]) = {
    doSaveState(fileName, toDoState)
  }

  override def loadState(fileName: Option[String]) = {
    toDoState = doLoadState[ToDoState](fileName).getOrElse(toDoState)
  }
}