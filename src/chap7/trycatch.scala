import java.io.FileReader
import java.io.FileNotFoundException

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException =>
  case ex: IOException =>
}