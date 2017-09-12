object UI {

  def welcome() = {
    UIBuilder.newPage("Welcome")
    UIBuilder.add("doSomthing")
    UIBuilder.printPage()
  }

  def toDoList(toDoSate : ToDoState): Unit ={
    UIBuilder.newPage("To Do List")
   // toDoSate.toDoList.
  }

}
