package com.example.kotlinpractice

//sum구하는 함수
fun sum(a: Int, b: Int): Int {
    return a + b
}

//sum 함수에서 생략가능 한 부분들
fun sum2(a: Int, b: Int) = a + b    //: Int, { }, return 생략됨

//최대값 구하는 함수
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Unit을 사용한 함수
fun outfunc(name: String): Unit {    //: Unit 생략 가능
    println("Hello $name!")
    // return Unit이 생략되어 있는 것
}   //fun outfunc(name: String) = println("Hello $name?") 로 생략가능

//default가 지정된 함수
fun min(a: Int, b: Int = 100) = if (a > b) b else a
//
fun normalVarargs(vararg a: Int){
    for(num in a){
        print("$num ")
    }
}
fun main() {

    val result1 = sum(2, 3)
    println(result1)

    val result2 = sum(3, 3)
    println(result2)

    val a = 10
    val b = 5

    val result3 = max(a, b)
    println(result3)

    outfunc("HEE DO")

    val result4 = min(50)
    println(result4)

    normalVarargs(1)
    normalVarargs(1, 2, 3, 4, 5)
}