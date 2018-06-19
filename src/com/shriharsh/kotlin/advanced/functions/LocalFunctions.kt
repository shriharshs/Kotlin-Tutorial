package com.shriharsh.kotlin.advanced.functions


/**
 * - You can create a local function within a function
 * - It is helpful when grouping your stuff within a function
 * - It is helpful when you do not want to expose function in the class, but restrict it to only a function
 *
 */

fun foo(fooParam: String){

    val outerFunctionParam = "Outer Value"
    fun bar(barParam: String){
        println(barParam)
        println(outerFunctionParam)
        println(fooParam)
    }

    bar("calling bar")
}

fun main(args: Array<String>) {
    foo("Hello Foo")
}