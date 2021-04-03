val big = new java.math.BigInteger("12345")
val greetString = new Array[String](3)
greetString(0) = "hello"
greetString(1) = ", "
greetString(2) = "world!\n"
for(i <- 0 to 2)
  print(greetString(i))