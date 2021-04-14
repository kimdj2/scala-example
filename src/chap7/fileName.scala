var filename = "default.txt"
if(!args.isEmpty)
  filename= args(0)

println(filename)

val filename2 =
  if(!args.isEmpty) args(0)
  else "default.txt"

println(filename2)

println(if(!args.isEmpty) args(0) else "default.txt")