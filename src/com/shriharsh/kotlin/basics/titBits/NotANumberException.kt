package com.shriharsh.kotlin.basics.titBits

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader

/**
 * Exceptions in Kotlin
 * - Base class for exception in Kotlin is Throwable
 *
 */

class NotANumberException(message: String) : Throwable(message) {
}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number!")
    }
}

fun main(args: Array<String>) {

    println("========== CUSTOM EXCEPTION============")
    try {
        checkIsNumber("A")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }

    println("==========TRY AND FINALLY============")
    var buffer: BufferedReader? = null
    val result = try {
        buffer = BufferedReader(FileReader("com/shriharsh/kotlin/basics/titBits/input.txt"))
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: FileNotFoundException) {
        println("Exception Handled!")
        -1
    } finally {
        println("Closing")
        buffer?.close()
        -2
    }

    println(result)

}