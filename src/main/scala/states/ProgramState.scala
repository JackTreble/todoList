package states


case class ProgramState(quiting : Boolean = false) {

}

object ProgramState {

  private var programState = new ProgramState()

  def setQuiting(quiting : Boolean) {
    programState = programState.copy(quiting = true)
  }

  def isQuiting(): Boolean ={
    programState.quiting
  }

}