package states


case class ProgramState(running : Boolean = true) {

}

object ProgramState {

  private var programState = new ProgramState()

  def stopRunning() {
    programState = programState.copy(running = false)
  }

  def isRunning(): Boolean ={
    programState.running
  }

}