package chap04.section2

fun main() {
//    fun Func(a: String, b: Int) {
//        for (n in 1..b) print(a)
//    }
//    Func("#", 3)

    fun Func1(a: Int){
        var number = a
        while(number<100){
            number+=1
            println(number)
            if (number==100) break
        }
    }
    Func1(90)
}