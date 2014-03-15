List(1, 2) ::: List(3, 4, 5)
List() ::: List(1, 2, 3)
List(1, 2, 3) ::: List(4)

def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

List(1, 2, 3).length

val abcde = List('a', 'b', 'c', 'd', 'e')
abcde.last
abcde.init

abcde.reverse
abcde

def rev[T](xs: List[T]) = xs match {
  case List() => xs
  case x :: xs1 => rev(xs1) ::: List(x)
}

abcde take 4
abcde drop 2
abcde splitAt 2

val fruit = List("apples", "oranges", "pears")
List(List(1, 2), List(3), List(), List(4, 5)).flatten

abcde.indices zip abcde 
val zipped = abcde zip List(1, 2, 3)
abcde.zipWithIndex
zipped.unzip

abcde.toString

abcde mkString ("[", ",", "]")
abcde mkString ""
abcde mkString ("List(", ", ", ")")

val buf = new StringBuilder
abcde addString (buf, "(", ";", ")")

val arr = abcde.toArray
arr.toList

val arr2 = new Array[Int](10)
List(1, 2, 3) copyToArray (arr2, 3)
arr2

val it = abcde.iterator
it.next
it.next


