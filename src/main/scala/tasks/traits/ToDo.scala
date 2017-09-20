package tasks.traits

trait ToDo {
  val title : String
  val description : String
  val complete : Boolean

  def completeTask : ToDo
}
