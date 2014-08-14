object Main {
  def main(args: Array[String]): Unit = {
    println("A1 is -> " + q1)
    println("A2 is -> " + q2)
  }

  def q1 = {
    // var sum = 0
    // for (i <- 1 to 999) {
    //   if (i % 3 == 0 || i % 5 == 0) sum = sum + i
    //   println(sum)
    // }
    (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
  }

  def q2 = {
    // def fib(n: Int): Int = n match {
    //   case 1 | 2 => 1
    //   case _     => fib(n - 1) + fib(n - 2)
    // }
    lazy val fs: Stream[Int] =
      0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)

    fs.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  }

  def fact(n: Int): Int = n match {
    case 1 => 1
    case _ => n * fact(n-1)
  }
}
