package com.shriharsh.kotlin.basics.functional

/**
 * ~ HIGHER ORDER FUNCTION
 * - A function which can take another function as parameter or return a function
 * - In below example, it is taking the function with the pattern of 2 int as input and returning a int as output
 * - In kotlin you can refer to a function when passing as a parameter using ::<NAME_OF_FUNCTION>
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))
}