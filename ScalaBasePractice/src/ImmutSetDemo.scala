import scala.collection.immutable.HashSet

object ImmutSetDemo extends App {
	val set1 = new HashSet[Int]()
	val set2 = set1 + 4
	println(set2)
	//set 中元素重复会覆盖
	val set3 = set1 ++ Set(5, 6, 7)
	println(set3)
	//
	val set0 = Set(1, 2, 3) ++ set1
	println(set0)

}
