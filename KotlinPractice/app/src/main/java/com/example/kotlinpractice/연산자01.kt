package com.example.kotlinpractice

    fun main(){
        var n = 10
        if(n%2==1){
            println("n은 홀수")
        }
        if(n%2==0){
            println("n은 짝수")
        }
        val numOfA = 12
        val result = numOfA - 1
        println("numOfA= $numOfA, result = $result")

        var num1 = 10
        var num2 = 10
        val result1 = ++num1
        val result2 = num2++

        println("result1: $result1")
        println("result2: $result2")
        println("num1: $num1")
        println("num2: $num2")
    }