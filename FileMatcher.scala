object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))    

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  def filesMatching(matcher: (String, String) => Boolean) = {
    for(file <- filesHere; if matcher(file.getName,query))
      yield file
  }
}