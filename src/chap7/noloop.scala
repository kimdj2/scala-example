var i = 0
var fountIt = false
while (i < args.length && !fountIt) {
  if(!args(i).startsWith("-")) {
    if(!args(i).endsWith(".scala")) 
      fountIt = true
  }
  i = i + 1
}

def searchFrom(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchFrom(i + 1)

val i = searchFrom(0)