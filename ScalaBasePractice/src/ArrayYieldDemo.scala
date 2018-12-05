object ArrayYieldDemo {

	val fun = (x:Int, y:Int) => x + y
	def m2(f:(Int, Int) => Int):Int = {
		f(5, 5)
	}

	def main(args: Array[String]): Unit = {
		val arr = Array(6, 7, 8, 91, 2, 3, 4, 5)

		val res = for(e <- arr if e % 2 == 0) yield e * 10
		println(res.toBuffer)

		//高级写法
		//filter 将数组中的元素取出 boolean类型  相当与条件if，map将前一次数据取出操作
		val r = arr.filter(_ % 2 == 0).map(_ * m2(fun))
		println(r.toBuffer)
		//r.sorted
		//打印数组中的数据，使用toBuffer，相当于是调用了一次遍历函数
		println(r.sorted.toBuffer)

		//元组
		//val t,(a, b, c) = ("hadoop", 3.14, 65534)

	}
}
