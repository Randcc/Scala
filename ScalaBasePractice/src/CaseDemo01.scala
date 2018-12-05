import scala.util.Random

object CaseDemo01 extends App {
//jzmb,bdyjy,cjk,ctxl,lzll
	val arr = Array("YoshizawaAkiho", "YuiHatano", "AoiSola", "AnriOkita", "MisakiRola ")
	val name = arr(Random.nextInt(arr.length))
	name match {
		case "YoshizawoAkiho" => println("吉泽老师。。。")
		case "YuiHatano" => println("波多老师。。。")
		case "AoiSola" => println("空空老师。。。")
		case "AnriOkita" => println("杏梨老师。。。")
		case "MisakiRola" => println("泷老师。。。")
		case _ => println("真不知道你们在说什么。。。")
	}

}
