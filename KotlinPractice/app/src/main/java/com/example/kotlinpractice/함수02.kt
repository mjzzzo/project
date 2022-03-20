package com.example.kotlinpractice
//람다식 이용하기
fun highFunc(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun main() {
    val result = highFunc(21, 25) { x, y -> x + y }
    println(result)
}