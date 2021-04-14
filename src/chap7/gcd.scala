def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

def gcd(x: Long, y:Long): Long = 
  if (y == 0) x else gcd(y, x % y)

println(gcdLoop(6, 9))
println(gcd(6,9))