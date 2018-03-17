package com.shriharsh.kotlin.basics.classes

/**
 * - OBJECT
 * ~ Objects helps in creating SINGLETON PATTERN
 * ~
 */
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)

    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI)
}