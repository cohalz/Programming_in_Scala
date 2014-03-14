sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

val v = Var("x")
val op = BinOp("+", Number(1), v)
v.name
op.left
println(op)
op.right == Var("x")
op.copy(operator = "-")

def simplifyTop(expr: Expr):Expr = expr match {
  case UnOp("-", UnOp("-", e)) => e
  case BinOp("+", e, Number(0)) => e
  case BinOp("*", e, Number(1)) => e
  case _ => expr
}

simplifyTop(UnOp("-", UnOp("-", Var("x"))))


def simplifyAll(expr: Expr):Expr = expr match {
  case UnOp("-", UnOp("-", e)) => e
  case BinOp("+", e, Number(0)) => e
  case BinOp("*", e, Number(1)) => e
  case UnOp(op,e) => 
    UnOp(op, simplifyAll(e))
  case BinOp(op, l, r) =>
    BinOp(op, simplifyAll(l), simplifyAll(r))
  case _ => expr
}

def describe(e: Expr): String = (e: @unchecked) match {
  case Number(_) => "a number"
  case Var(_) => "a variable"
}
