package com.example.kotlinpractice

fun main(){
    print("점수를 입력하세요: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score>=90){
        grade = 'A'
    } else if(score in 80.0..89.9){
        grade = 'B'
    } else if(score in 70.0..79.9){
        grade = 'C'
    }
    println("점수: $score, 등급: $grade")
}