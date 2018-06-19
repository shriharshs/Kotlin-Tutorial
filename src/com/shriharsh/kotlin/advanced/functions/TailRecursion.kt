package com.shriharsh.kotlin.advanced.functions

/**
 * One has to specify a function with tailrec if it can be possibly tail recursion, it cannot identify by itself
 *
 */

fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

//Specifying  a tailrec will replace the recursive call with loop, which helps in optimizations and less call stack
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    when (number) {
        0 -> return accumulator
        else -> return factorialTR(number - 1, accumulator * number)
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}