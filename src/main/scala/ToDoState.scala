

case class ToDoState (username : String, toDoList : List[Task] = List()) {
/*
  val toodoo = scala.collection.mutable.MutableList[String];
  toodoo + "2"*/

  def addToDo(task: Task): ToDoState = {
    copy(toDoList = toDoList :+ task)
  }
}

object ToDoState {
  var toDoState = ToDoState(username = "")
}