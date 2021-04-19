var more = 1

val addMore = (x: Int) => x + more

println(addMore(10))

def makeIncreaser(more: Int) = (x: Int) => x + more

val inc = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)

println(inc(10))
println(inc9999(10))
