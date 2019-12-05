package com.one.kotlin.`08`

class SmallHearderFather:IWashBowl by BigHearderSun{
    override fun washing() {

        println(" 我是小头爸爸")

        BigHearderSun.washing()

        println(" 哈哈哈 😆 ")

    }
}