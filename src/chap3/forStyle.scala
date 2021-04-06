def printArgs1(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

def printArgs2(args: Array[String]): Unit = {
  for(arg <- args) {
    println(arg)
  }
}

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}

val stringArr = Array("hello", "world")
printArgs1(stringArr)
printArgs2(stringArr)
printArgs3(stringArr)
