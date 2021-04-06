def formatArgs(args: Array[String]) = args.mkString(",")
val res = formatArgs(Array("zero", "one", "two"))
println(res)