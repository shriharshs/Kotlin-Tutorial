package com.shriharsh.kotlin.advanced.functions

/**
 *
 * - Inline takes the higher order function and inlines it at the calling point, which means copies and pastes the
 *     contents of the function at the line of calling the function point
 * - Inline functions helps in optimization, because it helps in avoinding unnecessary call stacks and anonymous classes
 * - Inlining works best with functions with lambda parameters
 *
 * - Side effects
 *      - It copies and pastes code
 *      - Everytime you call a inline function, it copies and pastes the code
 *      - If the body of the function is really large, you dont should be doing inlining
 *
 * - you can make a lambda not inline with keyword "noinline"
 * - you cannot store a inline function in a variable, and that is where. you can use the keyword noline
 * - Basically you can inline a function if you're only using a lambda expression, beyond that it is of no use
 *
 *
 */

inline fun operation(op: () -> Unit) {
    println("Before calling op()")

    op()

    println("After calling op()")

}

inline fun tryingToInline(noinline op: () -> Unit) {
    val reference = op //if you remove "noinline" from above, it gives error, as you cannot store a inline function in a variable, look at how
                        // "inline" keyword is higlighted and is shwoing some warning

    println("Assinged a value")

    op()
}


fun main(args: Array<String>) {

    //passing op as Lambda expression

    operation { println("This is the actual op function") }
}