def grep(pettern:String) =
  for{
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pettern)
  } println(file = ": " + trimmed)
