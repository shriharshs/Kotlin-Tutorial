package com.shriharsh.kotlin.advanced.coroutines.B_BridgingBlockingAndNonBlocking

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//Bridging blocking and non-blocking worlds

//The first example mixes non-blocking delay(...) and blocking Thread.sleep(...) in the same code.
//It is easy to get lost which one is blocking and which one is not.
//Let's be explicit about blocking using runBlocking coroutine builder:

//The result is the same, but this code uses only non-blocking delay.
// The main thread, that invokes runBlocking, blocks until the coroutine inside runBlocking completes.


fun main(args: Array<String>) {
    launch {
        // launch new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main thread continues here immediately
    runBlocking {
        // but this expression blocks the main thread
        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
    }
}