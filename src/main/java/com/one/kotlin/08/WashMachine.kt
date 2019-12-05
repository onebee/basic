package com.one.kotlin.`08`

class WashMachine(var name:String,var size:Int ) {
    fun open() {
        println(" 开门")
    }


}

fun main(args: Array<String>) {



    val washMachine=WashMachine("小天鹅",25)
    washMachine.open()

}