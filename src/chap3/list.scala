val oneTwoTree = List(1,2,3)

val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + "and " + threeFour + "were not mutated")
println("thus, " + oneTwoThreeFour + "is a new list")

val nilList = Nil
val nilList2 = List()
val thrill = "Will" :: "fill" :: "until" :: Nil
println(thrill(2))
println(thrill.count(s => s.length == 4))
println(thrill.drop(2))
println(thrill.dropRight(2))
println(thrill.exists(s => s.length == 4))
println(thrill.filter(s => s.length == 4))
println(thrill.forall(s => s.endsWith("l")))
thrill.foreach(s => println(s))
thrill.foreach(println)
println(thrill.head)
println(thrill.init)
println(thrill.isEmpty)
println(thrill.last)
println(thrill.length)
println(thrill.map(s => s + "y"))
println(thrill.mkString(", "))
println(thrill.filterNot(s => s.length == 4))
println(thrill.reverse)
println(thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))
println(thrill.tail)
