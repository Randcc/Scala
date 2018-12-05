import scala.collection.mutable

object MuMapDemo extends App {

	val map1 = new mutable.HashMap[String, Int]()
	map1("spark") = 1
	map1 += (("hadoop", 2))
	map1.put("storm", 3)
	println(map1)

	map1 -= "spark"
	map1.remove("hadoop")
	println(map1)
}
