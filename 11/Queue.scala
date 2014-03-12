import scala.collection.mutable.ArrayBuffer
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) {buf += x}
}
val queue = new BasicIntQueue
queue.put(20)
queue.put(10)
queue.get()
queue.get()

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}
class MyQueue extends BasicIntQueue with Doubling
val queue1 = new MyQueue
queue1 put 10
queue1 get()

val queue2 = new BasicIntQueue with Doubling
queue2 put 10
queue2 get

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x+1)}
}
trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if(x >= 0) super.put(x)
  }
}
val queue3 = new BasicIntQueue with Incrementing with Filtering
queue3 put -1
queue3 put 0
queue3 put 1
queue3 get
queue3 get

val queue4 = new BasicIntQueue with Filtering with Incrementing
queue4 put -1
queue4 put 0
queue4 put 1
queue4 get
queue4 get
queue4 get
