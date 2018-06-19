package com.shriharsh.kotlin.advanced.functions

/**
 * - If we return from a lambda, from within a function, it returns out from the function
 * - you can return from forEach with @forEach label or else a custom label name can be given in anotherContaningFunction()
 * - local returns are allowed only in the case of inline functions
 * - lambda does not do a local return whereas an anonymous function does a local return
 * - local return always returns to the closest function
 *
 */

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) {
            return@forEach // if not returned @forEach, the return will exit from the function
        }
    }

    println("Hello!")
}

fun anotheContainingFunction() {
    val numbers = 1..100
    numbers.forEach myBlock@{
        if (it % 5 == 0) {
            return@myBlock // if not returned @forEach, the return will exit from the function
        }
    }

    println("Hello again!")
}

fun yetAnotherCOntainingFunction() {
    val numbers = 1..100
    numbers.forEach(fun(it) { //Anonymous function
        if (it % 5 == 0) {
            return // here though we do not have a label, local return returns to the closest function, which here is anonymous function
        }
    })

    println("Yet another Hello!")
}

fun main(args: Array<String>) {

    containingFunction()

    anotheContainingFunction()

    yetAnotherCOntainingFunction()

}

