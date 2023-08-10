fun main(args: Array<String>) {
    println("Hello World!")

    //val은 변경 불가, var은 변경 가능 && 암묵적 캐스팅 가능
    val appName:String = "Shoppi"
    var userName = "sumin"

    //Nullable Types -> Null로 데이터 입력 가능 -> 사용법은 '?'으로 사용 가능
    var userName2: String? = null

    //Array 사용법


    println("Program arguments: ${args.joinToString()}")
}