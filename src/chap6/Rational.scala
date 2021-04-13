class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this(n, 1)
  override def toString = numer + "/" + denom
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom, 
      denom * that.denom
    )
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  private def gcd(a: Int, b: Int): Int = 
    if (b == 0) a else gcd(b, a % b)
}

implicit def intToRational(x: Int): Rational = new Rational(x)

val y = new Rational(3)
println(y)

val oneHalf = new Rational(1,2)
val twoThirds = new Rational(2,3)

val addResult = oneHalf + twoThirds
println(addResult)

val multiResult = oneHalf * twoThirds
println(multiResult)

val gcdResult = new Rational(77, 49)

println(gcdResult)

val intResult = 2 * oneHalf

println(intResult)