package com.one.kotlin.cipher

fun main(args: Array<String>) {


//    val c:Char = 'a'
//    val value :Int = c.toInt()
//    println(value)

    val stringBuilder = with(StringBuilder()){
        val str ="I love you"
        for (ch in str) {
            val result = ch.toInt()
            append(ch)
           toString()
        }

    }


    println(stringBuilder)

}