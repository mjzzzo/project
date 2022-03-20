package chap04.section2

fun main(){
    result()
}
fun Lambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}
fun result(){
    println("첫번째 문장")
    Lambda(10,10){ a, b->
        val result = a + b
        if(result > 10) return@Lambda
        println("두번째 문장")
    }
    println("세번째 문장")
}