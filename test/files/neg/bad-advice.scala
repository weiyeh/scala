//> using options -Xfatal-warnings
//
object Bip
object Test {
  def f(x: Int) = x match {
    case Bip => true
  }
}
