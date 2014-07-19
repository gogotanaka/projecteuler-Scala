object Main {
  def main(args: Array[String]): Unit = {
    println(q1)
  }

  def q1 = {
    // var sum = 0
    // for (i <- 1 to 999) {
    //   if (i % 3 == 0 || i % 5 == 0) sum = sum + i
    //   println(sum)
    // }
    (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
  }

  def fact(n: Int): Int = n match {
    case 1 => 1
    case _ => n * fact(n-1)
  }

  def fib(n: Int): Int = n match {
    case 1 | 2 => 1
    case _     => fib(n - 1) + fib(n - 2)
  }
}
