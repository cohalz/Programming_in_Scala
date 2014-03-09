def scalaFiles =
  for{
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file
