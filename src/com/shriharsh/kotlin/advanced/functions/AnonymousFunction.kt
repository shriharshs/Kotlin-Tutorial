package com.shriharsh.kotlin.advanced.functions

/**
 * - An Anonymous function is a function created with a keyword "fun" and full body,but has no name
 * - With lambda expression you cannot express the return type
 * - Within anonymous function you can multiple return points
 * -
 *
 */

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    //Lambda exppression
    val value = op(3, { it * it })

    println("Value - " + value)

    //Anonymous function
    val anotherValue = op(3, fun(y: Int): Int {
        if (y > 10) {
            return 0
        } else {
            return y * y
        }
    })

    println("Another Value - " + anotherValue)
}