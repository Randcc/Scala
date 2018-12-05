object ForArrayDemo {

	def main(args: Array[String]): Unit = {
		val arr = Array(1, 2, 3, 4, 5, 6, 7, 8)
		for (i <- arr)
			print(i)
		println()
		for (i <- (0 until arr.length).reverse)
			print(arr(i))
	}
}
