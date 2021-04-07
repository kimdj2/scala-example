class ChecksumAccumulator {
  private var sum = 0;
  def add(b: Byte): Unit = { sum += b }
  def checkSum(): Int = ~(sum & 0xFF) + 1
}

val ca = new ChecksumAccumulator
ca.add(1)

println(ca.checkSum())