val someNumbers = List(-11, -10, -5, 0, 5, 10)

println(someNumbers.filter((x: Int) => x > 0).mkString(", "))

println(someNumbers.filter((x) => x > 0).mkString(", "))

println(someNumbers.filter(_ > 0).mkString(", "))

val f = (_: Int) + (_: Int)
println(f(10, 5))

someNumbers.foreach(println _)

someNumbers.foreach(println)

def sum(a: Int, b: Int, c: Int): Int = a + b + c
println(sum(1,2,3))

val a = sum _
println(a(1,2,3))

println(a.apply(1,2,3))

val b = sum(1, _: Int, 3)
println(b(2))