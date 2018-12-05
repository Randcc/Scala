import java.io.IOException

class Student(val name: String, val age:Int) {
	println("执行主构造器")

	try {
		println("读取文件")
		throw new IOException("io exception")
	}catch {
		case e: NullPointerException => println("打印异常Exception： " + e)
		case e:IOException => println("打印异常Exception： " + e)
	}finally {
		println("执行finally 部分")
	}

	private var gender = "male"

	def this(name: String, age:Int, gender:String){
		this(name, age)
		println("执行辅助构造器")
		this.gender = gender
	}

}
