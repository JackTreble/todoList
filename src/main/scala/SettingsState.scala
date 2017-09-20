
/**
  * This State class is for the core application settings,
  * Might Split into sub setting states in the future
  */
case class SettingsState(displaySubTasksOnMainList: Boolean = true,
                         displayCompletedTasks: Boolean = true,
                         displayCompletedSubTasks: Boolean = true) {

}

object SettingsState extends StateJsonSerializer {

  implicit var settingsState = new SettingsState()

  def getSettingsState(): SettingsState = {
    settingsState
  }

  implicit val defaultFileName = "todoState"

  override def saveState(fileName: Option[String] = None) = {
    doSaveState(fileName, settingsState)
  }

  override def loadState(fileName: Option[String] = None) = {
    settingsState = doLoadState[SettingsState](fileName).getOrElse(settingsState)
  }
}
