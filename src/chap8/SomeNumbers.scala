val someNumbers = List(-11, -10, -5, 0, 5, 10)

println(someNumbers.filter((x: Int) => x > 0).mkString(", "))

println(someNumbers.filter((x) => x > 0).mkString(", "))

println(someNumbers.filter(_ > 0).mkString(", "))

val f = (_: Int) + (_: Int)
println(f(10, 5))

someNumbers.foreach(println _)