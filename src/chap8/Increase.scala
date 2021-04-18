var increase = (x: Int) => x + 1
println(increase(1))

increase = (x: Int) => x + 9999
println(increase(10))

increase = (x: Int) => {
  println("a")
  println("b")
  x + 1
}

println(increase(100))