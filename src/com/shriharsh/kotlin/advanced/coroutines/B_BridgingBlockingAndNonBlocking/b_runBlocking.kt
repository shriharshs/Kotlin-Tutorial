package com.shriharsh.kotlin.advanced.coroutines.B_BridgingBlockingAndNonBlocking

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//The previous example can be also rewritten in a more idiomatic way,
// using runBlocking to wrap the execution of the main function

//Here runBlocking<Unit> { ... } works as an adaptor that is used to start the top-level main coroutine.
// We explicitly specify its Unit return type, because a well-formed main function in Kotlin has to return Unit.

fun main(args: Array<String>) = runBlocking<Unit> {
    // start main coroutine
    launch {
        // launch new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main coroutine continues here immediately
    delay(2000L)      // delaying for 2 seconds to keep JVM alive
}