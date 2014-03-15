List.apply(1, 2, 3)

List.range(1, 5)
List.range(1, 9, 2)
List.range(9, 1, -3)

List.fill(5)('a')
List.fill(3)("hello")
List.fill(2, 3)('b')

val squares = List.tabulate(5)(n => n * n)
val multiplication = List.tabulate(5, 5)(_ * _)

List.concat(List('a','b'), List('c'))
List.concat(List(),List('b'), List('c'))
List.concat()

(List(10, 20), List(3, 4, 5)).zipped.map(_ * _)

(List("abc", "de"), List(3, 2)).zipped.forall(_.length == _)
(List("abc", "de"), List(3, 2)).zipped.forall(_.length != _)
