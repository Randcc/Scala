object CaseDemo03 extends App {
	val lst = List(3, -1)
	lst match {
		case 0 :: Nil => println("only 0") ///不懂
		case x :: y :: Nil => println("only 0")
		case 0 :: tail => println(" 0")
		case _  => println("something else")
	}
}
