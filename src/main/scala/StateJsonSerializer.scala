import java.io.{BufferedWriter, File, FileNotFoundException, FileWriter}

import org.json4s._
import org.json4s.native.JsonMethods.parse
import org.json4s.native.Serialization.write

/**
  * Saves and loads States to and from JSON
  */
trait StateJsonSerializer {

  private implicit val formats = DefaultFormats

  private val jsonExt = ".json"

  def saveState(fileName: Option[String] = None)

  def loadState(fileName: Option[String] = None)

  protected def doLoadState[E : Manifest](fileName: Option[String])(implicit defaultFileName: String): Option[E] = try {
    Some(parse(getJsonFile(fileName)).extract[E])
  } catch {
    case e: FileNotFoundException => println(fileName.getOrElse(defaultFileName) + " not found"); None;
    case e: MappingException => println("Json File did not contain state "); None;
  }

  protected def doSaveState(fileName: Option[String], stateToSave: AnyRef)(implicit defaultFileName: String) = {
    val bw = new BufferedWriter(new FileWriter(getJsonFile(fileName)))
    bw.write(write(stateToSave))
    bw.close()
  }

  private def getJsonFile(fileName: Option[String])(implicit defaultFileName: String): File = {
    if (fileName.getOrElse(defaultFileName).endsWith(jsonExt)) {
      new File(fileName.getOrElse(defaultFileName))
    } else {
      new File(fileName.getOrElse(defaultFileName) + jsonExt)
    }
  }

}
