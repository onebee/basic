package com.one.kotlin.`07`

class demo {

    var str="two";



}
fun ff(){


    val demo = demo()

    println(demo.str)

    println("one")
}

fun main(args:Array<String>) {

    var result =0
    println(add(1000000,result))

}

tailrec fun add(num:Int,result:Int):Int{
    println("计算第 ${num}次运算, result=${result}")
    if (num == 0) {
        return 1
    } else {
        return  add(num-1,result+num)
    }
}