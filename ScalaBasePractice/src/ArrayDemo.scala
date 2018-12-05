import scala.collection.mutable.ArrayBuffer

object ArrayDemo {


	def main(args: Array[String]): Unit = {
		//new 数组长度为10
		val arr1 = new Array[Int](10)
		arr1(2) = 1
		println(arr1)
		println(arr1.toBuffer)
		println(arr1.length)

		//长度为1的数组
		val arr2 = Array[Int](10)
		arr2(0) = 1
		println(arr2.toBuffer)
		println(arr2.length)

		val arr3 = Array("hadoop", "storm", "spark")
		println(arr3.length)
		println(arr3(2))

		println("**************************")

		//变长数组 数组缓冲
		val ab = ArrayBuffer[Int]()
		ab += 1
		println(ab)
		ab += (2, 3, 4, 5)
		println(ab)
		ab ++= Array(6, 7)
		println(ab)
		ab ++= ArrayBuffer(8, 9)
		println(ab)
		ab.insert(0, -1, 0)
		println(ab)
		//在第8个元素的位置，移去2个
		ab.remove(8, 2)
		println(ab)

	}
}
