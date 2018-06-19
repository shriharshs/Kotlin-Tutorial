package com.shriharsh.kotlin.advanced.functions

/**
 * In kotlinf,
 *
 * - A member functions or a extenison function with single parameter can be called using infix notations, only if the methos has infix
 *   kwyword attached to it
 *
 */


fun String.shouldBeEqualTo(value: String) = this == value

//Infix Notation
infix fun String.amIEqualTo(value: String) = this == value

fun main(args: Array<String>) {

    //Normal way to call a function
    val value = "Hello".shouldBeEqualTo("Hello")

    println("Value " + value)

    val anotherValue = "Hello".shouldBeEqualTo("Hell")

    println("Another value " + anotherValue)

    //Infix way of calling a function
    val output = "Hey"

    val whatIsIt = output amIEqualTo "hey"

    println("WhatIsIt - " + whatIsIt)

}