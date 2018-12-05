import scala.util.Random

object ConditionDemo {

	def main001(args: Array[String]): Unit = {
		var input = 0
		var num = Random.nextInt(100)
		while(true){
			input = readInt()
			println(input)
			println(num)
			if (input > num) println("bigger")
			else if(input < num) println("smaller")
			else {
				println("congriturations\n")
				println("next round")
				num = Random.nextInt(100)
			}
		}
	}

	def main(args: Array[String]): Unit = {
		val arr = Array("hello", "world", "test")
		for (i <- arr)
			println(i)
		for(i <- 1 to 4; j <- 1 to 5 if i != j){
			print((10 * i + j) + " ")
			println(i + j)
		}
		println()

	}

}
