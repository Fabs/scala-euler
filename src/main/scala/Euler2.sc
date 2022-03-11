val fibs: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2}
val fibsPair: LazyList[(Int, Int)] = (0,1) #:: fibsPair.map(n => (n._2, n._1 + n._2))
val fibs2 = fibsPair.map(_._2)

val res = fibs2
  .filter(_ % 2 == 0)
  .takeWhile(_ < 4000000).sum
