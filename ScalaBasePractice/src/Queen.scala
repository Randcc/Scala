
class Queen private(val name: String, prop:Array[String], private var age:Int = 18){
	println(prop.size)
	println(prop.toBuffer)
	def description = name +  " is " + age + " years old with " + prop.toBuffer
}

object Queen{
	def main(args: Array[String]): Unit = {
		val q = new Queen("hatano", Array("啊啊", "哈哈"), 20)
		println(q.description)
	}
}
