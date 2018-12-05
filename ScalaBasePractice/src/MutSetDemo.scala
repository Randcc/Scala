import scala.collection.mutable

object MutSetDemo extends App {
	val set1 = new mutable.HashSet[Int]()
	//集合加起来是没有顺序的，只表示一串数字
	set1 += 2
	set1.add(4)
	println(set1)
	set1 ++= Set(1, 3, 5)
	println(set1)
	set1 -= 5
	set1.remove(2)
	println(set1)

}
