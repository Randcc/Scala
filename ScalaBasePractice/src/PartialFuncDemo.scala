object PartialFuncDemo {

	def fun1:PartialFunction[String, Int] ={
		case "one" => 1
		case "two" => 2
		case _ => -1
	}

	def fun2:PartialFunction[String, Int] ={
		case "one" => 1
		case "two" => 2
		case _ => -1
	}

	def main(args: Array[String]): Unit = {
		println(fun1("one"))
		println(fun2("one"))

	}
}
