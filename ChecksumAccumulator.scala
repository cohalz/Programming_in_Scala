import scala.collection.mutable.Map
object ChecksumAccumulator {
  private val cache = Map[String,Int]()
  def calculate(s:String):Int = 
    if (cache.contains(s)) 
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

class ChecksumAccumulator {
  private var sum = 0
  def add(b:Byte) { sum += b } //等号を省略するとUnit型として扱われる
  def checksum():Int = ~(sum & 0xFF) + 1
}
 
