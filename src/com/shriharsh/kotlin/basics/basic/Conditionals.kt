package com.shriharsh.kotlin.basics.basic

fun main(args: Array<String>) {

    //Normal If else conditions
    var myString = "Not Empty"

    /*In kotlin
    *  ~ A conditional IF can be used as an EXPRESSION.
    *  ~ And it will return the value on the last line.
    *  ~ So when the if statement is TRUE and it enters in that part of the condition and returns from their, it their is a println
    *       on the last line, it will return Kotlin.Unit
    *  ~ If different parts of condition returns different types, then it will return "Any" which is top level object for any class in Kotlin.
    *  ~ If ever IF conditional statement is used a expression then it should have ELSE block, or else it show error, as the expression result
    *       needs to have some value when the condition is not satisfied.
    * */
    val ifResult = if (myString != "") {
//        println("Not empty") //It will return Kotlin.Unit here
        "Not Empty" //It will return NOT EMPTY here
    } else {
//        println("Empty") //It will return Kotlin.Unit here
        "Empty" //It will return EMPTY here

    }

    println("Result of IF conditional -> " + ifResult)

    /* WHEN
     * ~ The result from above can be used a CASE in any other languages with WHEN in Kotlin
     * ~ WHEN does not limit to check anything, you can perform any kinda actions on it
     * ~ And it just executes only one that line where the expression is matched and BREAKS immediately their.
     *      So you dont need a BREAK like in other langs
     * ~ If you want to use multiline in WHEN, then use {} on that line
     * ~ WHEN can also be used as expression like the above IF conditional, and it also needs ELSE block, if used as a expression.
     * ~ If different parts of condition returns different types, then it will return "Any" which is top level object for any class in Kotlin.
     *      And code will be highlighted, as in below, if it returns same type from all branches then the highlight would go away
     */
    val whenResult = when (ifResult) {
        "Not Empty" -> {
            println("Its Something!")
            "Its Not Empty!"
        }
        is String -> println("Its a String!")
        "Multiline example" -> {
            println("This is used when needed for multiline")
            println("Another line")
        }
        else -> println("Its here in ELSE!")
    }

    println("Result of WHEN conditional -> " + whenResult)


}