def curriedSum(x: Int)(y: Int) = x+y

println(curriedSum(1)(2))

val oneplus = curriedSum(1)_
println(oneplus(2))

val twoplus = curriedSum(2)_
println(twoplus(2))
