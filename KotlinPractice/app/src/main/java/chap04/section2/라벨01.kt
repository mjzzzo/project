package chap04.section2

import kotlin.io.println as println1

fun main(){
    result()
    val num1 = 10
    val num2 = 10
}
fun Lambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}
fun result(){
    println1("첫번째 문장")
    Lambda(10,10){ a, b->
        val result = a + b
        if(result > 10) return@Lambda
        println1("두번째 문장")
    }
    println1("세번째 문장")
}