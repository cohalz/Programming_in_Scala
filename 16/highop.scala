List(1, 2, 3) map (_ + 1)

val words = List("the", "quick", "brown", "fox")
words map (_.length)
words map (_.toList.reverse.mkString)

words map (_.toList)
words flatMap (_.toList)

List.range(1, 5) flatMap (
  i => List.range(1, i) map (j => (i, j))
  )

var sum = 0
List(1, 2, 3, 4, 5) foreach (sum += _)
sum

val onetofive = List(1, 2, 3, 4, 5)
onetofive filter (_%2 == 0)
words filter (_.length == 3)

onetofive partition (_%2 == 0)

onetofive find (_%2 == 0)
onetofive find (_ <= 0)

List(1, 2, 3, -4, 5) takeWhile (_ > 0)
words dropWhile (_ startsWith "t")

List(1, 3, 3, -4, 5) span (_ > 0)

def hasZeroRow(m: List[List[Int]]) =
  m exists (row => row forall (_ == 0))

def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
sum(onetofive)

def product(xs: List[Int]): Int = (1 /: xs) (_ * _)

("" /: words) (_ + " " + _)
(words.head /: words.tail) (_ + " " + _)

def flattenLeft[T](xss: List[List[T]]) =
  (List[T]() /: xss) (_ ::: _) 
def flattenRight[T](xss: List[List[T]]) =
  (xss :\ List[T]()) (_ ::: _)

def reverseLeft[T](xs: List[T]) = (List[T]() /: xs) {(ys, y) => y :: ys}

List(1, -3, 4, 2, 6) sortWith (_ < _)
words sortWith (_.length > _.length)
