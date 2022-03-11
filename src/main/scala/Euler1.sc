val naturals: LazyList[Int] = LazyList.from(1)

val res = naturals
  .filter( n => n % 3 == 0 || n % 5 == 0)
  .takeWhile(_ < 1000).sum
