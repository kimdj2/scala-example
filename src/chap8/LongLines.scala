import scala.io.Source
object LongLines {
  def processFile(filename: String, width: Int) = {
    val source = Source.fromFile(fileName)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }
  private def processLine(filename: String, width: Int, line: String) = {
    if (line.length > width) {
      println(filename + ": " + line.trim)
    }
  }

  def processFile2 (filename: String, width: Int) = {
    def processLine2(lint: String) = {
      if(line.length > width) 
        println(filename + ": " + line.trim)
    }
    val source = Source.fromFile(fileName)
    for (line <- source.getLines())
      processLine2(line)
  }
}