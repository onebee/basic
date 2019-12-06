package com.one.kotlin.`09`

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {

    // 内存中创建一个宽和高为100 的图片
    var image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)

    var w = 0..99
    var h = 0..99
//    image.setRGB(0,0,0xff0000)

    image.apply {
        for (i in w) {
            for (j in h) {
                setRGB(i,j,0xffff99)
            }
        }
    }
    ImageIO.write(image, "bmp", File("a.bmp"))
}