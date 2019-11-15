package com.one.kotlin.`04`

fun main(args: Array<String>) {

    var nums = 1..100
    for (num in nums step 10) {
        println(" ${num} ,")
    }


}
fun heat(str: String?): String {
    return "热" + str;
}

fun gradeStudent(store: Int):String {


    val s = when (store) {
        10 -> "满分"
        9 -> "9999"
        6 -> "666"
        3 -> "333"

        else -> " 其他"

    }
    return s;
}