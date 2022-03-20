package com.example.kotlinpractice

fun main() {
    //if 문
    val a = 10
    val b = 5

    val max: Int
    if (a > b)
        max = a
    else
        max = b
    println("max is $max")

    //if문 간략화하기
    val max1 = if (a > b) a else b
    println("max1 is $max1")

    //중괄호 사용
    val max2 = if(a>b){
        println("max2는 a")
        a
    }
    else{
        println("max2는 b")
        b
    }
    println("max2 is $max2")

}