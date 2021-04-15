for (i <- 1 to 4)
  println("Iteration" + i)
for (i <- 1 until 4)
  println("Iteration" + i)

val filesHere = (new java.io.File(".")).listFiles
println(filesHere)
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)

def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines().toList
def grep(pattern: String) = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(file + ": " + line.trim)
grep(".*gcd.*")


def grep2(pattern: String) = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)
grep2(".*gcd.*")

def scalaFiles =
  for {
    file <- filesHere
    if field.getName.endsWith(".scala")
  } yield file