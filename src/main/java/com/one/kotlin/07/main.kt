package com.one.kotlin.`07`

import java.math.BigInteger

// 递归 阶乘
fun main(args: Array<String>) {


    var num =BigInteger("2000")


    println(fact(num))

}

fun fact(num :BigInteger):BigInteger{

    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num* fact(num-BigInteger.ONE);
    }
}
