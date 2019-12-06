package com.one.kotlin.`09`

/**
 * (T) -> Unit 接收的参数的类型
 * (String) -> Unit 函数类型,参数为字符串,返回值是Unit
 */
fun main(args: Array<String>) {


    var name = listOf<String>("tom", "jerry", "lucy")
    name.forEach(print)

    name.forEach {

        println(it)
    }

}

var print = fun (name: String): Unit {
    println(name)
}