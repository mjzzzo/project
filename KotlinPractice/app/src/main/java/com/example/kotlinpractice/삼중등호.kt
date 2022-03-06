package com.example.kotlinpractice

fun main(args: Array<String>) {
    val a: Int = 128
    val b: Int? = 128
    println(a === b)

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)

}