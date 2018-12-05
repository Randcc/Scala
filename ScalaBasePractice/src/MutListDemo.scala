import scala.collection.mutable.ListBuffer

object MutListDemo extends App {
	val lst0 = ListBuffer[Int](1, 2, 3)
	val lst1 = new ListBuffer[Int]
	println(lst0)
	println(lst1)

	lst1 += 4
	lst1.append(5)
	println(lst1)

	lst0 ++= lst1
	println(lst0)

	val lst2 = lst0 ++ lst1
	println(lst2)
	//追加生成新的数组
	val  lst3 = lst0 :+ 5
	println(lst3)

}
