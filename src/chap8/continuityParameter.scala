def echo(args: String*) =
  for (arg <- args) println(arg)

echo("string")
echo("hello", "world")

val arr = Array("what", "is", "this")
echo(arr: _*)