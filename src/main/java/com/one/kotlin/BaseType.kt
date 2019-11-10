package com.one.kotlin

import kotlin.math.abs

fun main(args: Array<String>) {


    var aByte = Byte.MAX_VALUE
    var bByte = Byte.MIN_VALUE

//    println(aByte)
//    println(bByte)

    val plus = plus(3 , 9)
    println(plus)


    sss("猎豹吧")

}

fun plus(a:Int,b:Int):Int{
    return a+b;
}

fun sss(placeName: String) {
    var tem = """
        
        今天太强   ${placeName} 长度  ${placeName.length}
    """.trimIndent()

    println(tem)
}