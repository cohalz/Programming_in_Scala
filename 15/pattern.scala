val myTuple = (123,"abc")
val (number,string) = myTuple

val withDefault: Option[Int] => Int = {
  case Some(x) => x
  case None => 0
}

withDefault(Some(10))
withDefault(None)

val second: List[Int] => Int = {
  case x :: y :: _ => y
}
second(List())

val second: PartialFunction[List[Int], Int] = {
  case x :: y :: _ => y
}

second.isDefinedAt(List(5,6,7))
second.isDefinedAt(List())

val results = List(Some("apple"), None, Some("orange"))
for(Some(fruit) <- results) println(fruit)
