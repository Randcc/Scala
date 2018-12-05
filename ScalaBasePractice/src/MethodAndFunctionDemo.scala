object MethodAndFunctionDemo {

	//方法传入了实参，函数有点像接口
	def m1(f:(Int, Int) => Int): Int = {
		f(2, 6)
	}

	val f1 = (x:Int, y:Int) => x + y
	val r1 = (x: Int, y:Int) => x * y

	def main(args: Array[String]): Unit = {
		val re1 = m1(f1)
		println(re1)
		val re2= m1(r1)
		println(re2)
		//val f1 = m1 _  将方法变成函数
	}
}
