package com.shriharsh.kotlin.basics.functions

/*
In Kotlin,
~ Functions are first class citizens
~ You can have top level functions, which means you do not need to have any static class which holds the functions
~
 */

/*
- kotlin.Unit
~ By default functions in kotlin return Unit, which is kinda Void, so mentioning explicitly retur type as Unit is not mandatory
~ Unit is kinda object which we can compare to, where Void we cannot, so Unit is slightly different from Void
 */
fun hello(): Unit {
    println("Hello")
}

/*
- Nothing
~ It can be used in a some special case scenarios, where you can say function does not return a value but can throw errors/exception
~ It represents a value that never exists
 */
fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsFour(): Int {
    return 4
}

fun sum(x: Int, y: Int): Int {
    return x + y
}


/*
- Single expression function
~ USeful when you want to do the logic calculations in one line
~ They do not function block
 */
fun sumOnLine(x: Int, y: Int) = x + y

/*
- Default Parameter
~ You can provide default value to a parameter in a function declaration
~ This helps in creating multiple overloads of the function
~ You can pass specific parameter value, by naming it in the function call, using NAMED PARAMETERS
~ Using named parameter, you can also change/maintain the order of the parameters passed
 */
fun defaultParameterFun(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

/*
- Undefined number of parameters
~ Using vararg, you can accept undefined number of parameters
~ Using * (spread operator) you can pass a vararg function to another vararg, or else compiler will throw error
 */
fun undefinedNumberParametersFun(vararg strings: String) {
    printAllStrings(*strings)
}

private fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()

    val valueFour = returnsFour()

    val valueOfDefaultParFun = defaultParameterFun(1, 2)

    defaultParameterFun(1, 2, 3)

    //Named parameter
    defaultParameterFun(1, 2, w = 10)

    //Change the Order of the named parameters
    defaultParameterFun(w = 10, x = 20, y = 30)

    //UNdefined number of parameters
    undefinedNumberParametersFun("1")
    undefinedNumberParametersFun("1", "2")
    undefinedNumberParametersFun("1", "2", "3")
    undefinedNumberParametersFun("1", "2", "3", "4")

}