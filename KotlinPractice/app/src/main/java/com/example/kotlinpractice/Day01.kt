package com.example.kotlinpractice

fun main() {

    // 자료형 변환
    val a: Int = 66
    val b: Double = a.toDouble()
    val c: Byte = a.toByte()
    val d: Float = a.toFloat()
    val e: Long = a.toLong()
    val f: Char = a.toChar()

    println("a: $a")
    println("b: $b")
    println("c: $c")
    println("d: $d")
    println("e: $e")
    println("f: $f")

    //참조주소 비교

    val g: Int = 128
    val h: Int = 128
    println(g == h)
    println(g === h)

    val i: Int = 128
    val j: Int? = 128

    println(i == j)
    println(i === j)


}