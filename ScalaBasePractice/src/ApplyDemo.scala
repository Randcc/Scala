object ApplyDemo {

	def main(args: Array[String]): Unit = {
		val h = new Human
		println(h.fight)
	}

}
//超类，相当与接口
trait Flyable{
	def fly(): Unit = {
		println("I can fly")
	}

	def fight():String
}

abstract class Animal{
	def run(): Int
	val name: String
}

class Human extends Animal with Flyable{
	val name = "abc"

	val t1,t2,(a, b, c) = {
		println("ABC")
		(1, 2, 3)
	}
	override def run(): Int = {
		1
	}

	override def fight(): String = {
		"fight with 棒子"
	}
}