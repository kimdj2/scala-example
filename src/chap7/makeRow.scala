def makeRowSeq(row: Int) = 
  for (col <- 1 until 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }
def makeRow(row: Int) = makeRowSeq(row).mkString
def multiTable() = {
  val tableSeq = 
    for (row <- 1 until 10)
    yield makeRow(row)
  tableSeq.mkString("\n")
}
println(multiTable())