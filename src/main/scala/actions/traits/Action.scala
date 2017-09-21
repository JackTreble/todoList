package actions.traits

trait Action {

  def instanceOf(action : T){
    this.equals(action)
  }
}
