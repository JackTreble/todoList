package Task

case class SubTask(title : String, description : String, complete : Boolean) extends ToDo {
  def completeTask: SubTask = {
    copy(complete = true)
  }

  //TODO
  override def toString: String = super.toString
}