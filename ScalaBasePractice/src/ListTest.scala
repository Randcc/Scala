object ListTest extends App {

	//创建一个List
	val lst0 = List(1,7,9,8,0,3,5,4,6,2)
	println(lst0)
	//将lst0中每个元素乘以10后生成一个新的集合
	val lst1 = for (arr <- lst0) yield arr * 10
	println(lst1)
	//将lst0中的偶数取出来生成一个新的集合
	val lst2 = for (arr <- lst0 if arr % 2 == 0) yield arr
	println(lst2)
	//将lst0排序后生成一个新的集合
	val lst3 = lst0.sorted
	println(lst3)
	//反转顺序
	val lst4 = lst0.reverse
	println(lst4)
	//将lst0中的元素4个一组,类型为Iterator[List[Int]]
	val lst5 = lst0.grouped(4)
	println(lst5)
	//将Iterator转换成List
	val lst6 = lst5.toList
	println(lst6)
	//将多个list压扁成一个List
	val lst7 = lst6.flatten
	println(lst7)
	println("***************************")

	val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
	//先按空格切分，在压平
	val lines1 = lines.flatMap(_.split(" "))
	println(lines1)

	//并行计算求和
	val par = lst0.par
	val parSum = par.sum
	println(parSum)
	//化简：reduce
	val parSum2 = par.reduce(_ + _)  //从右边往左加
	println(parSum2)

	//将非特定顺序的二元操作应用到所有元素
	val lst8 = lst0.reduce((x, y) => x + y)
	println(lst8)
	//安照特定的顺序
	val lst9 = lst0.reduceLeft(_ + _)
	println(lst9)

	//折叠：有初始值（无特定顺序）
	val lst10 = lst0.fold(100)((x, y) => x + y)
	//折叠：有初始值（有特定顺序）
	val lst11 = lst0.foldLeft(100)((x, y) => x + y)

	//聚合
	def seqOp(a:Int, b:List[Int]): Int ={
		println("seqOp" + a + '\t' + b)
		a + b.sum
	}

	def comOp(a:Int, b:Int): Int ={
		println("comOp" + a + '\t' + b)
		a + b
	}
	println("***************************")

	val arr = List(List(1, 2, 3), List(3, 4, 5), List(2), List(0))
	val result = arr.aggregate(10)(seqOp, comOp)
	println(result)

	val l1 = List(5,6,4,7)
	val l2 = List(1,2,3,4)
	//求并集
	val r1 = l2.union(l1)
	println(r1)

	//求交集
	val r2 = l1.intersect(l2)
	println(r2)

	//求差集
	val  r3 = l1.diff(l2)
	println(r3)
}
