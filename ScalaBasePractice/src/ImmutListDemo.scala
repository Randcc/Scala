object ImmutListDemo {

	def main(args: Array[String]): Unit = {
		val lst1 = List(1, 2, 3)
		println(lst1)
		//生成新的List
		val lst2 = 0 :: lst1
		println(lst2)
		val lst3 = lst1.::(0)
		println(lst3)
		//前面插入
		val lst4 = 0 +: lst1
		println(lst4)
		//后面插入
		val lst6 = lst1 :+ 3
		println(lst6)

		println("**********************")
		val lst0 = List(4, 5, 6)
		val lst7 = lst1 ++ lst0
		println(lst7)
		val lst9 = lst1.:::(lst0)
		println(lst7)
	}

}
