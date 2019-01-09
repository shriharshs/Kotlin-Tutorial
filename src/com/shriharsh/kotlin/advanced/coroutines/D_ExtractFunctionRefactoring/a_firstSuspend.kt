package com.shriharsh.kotlin.advanced.coroutines.D_ExtractFunctionRefactoring

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//Let's extract the block of code inside launch { ... } into a separate function.
//When you perform "Extract function" refactoring on this code you get a new function with suspend modifier.
//That is your first suspending function.
//Suspending functions can be used inside coroutines just like regular functions, but their additional feature is that they can,
//in turn, use other suspending functions, like delay in this example, to suspend execution of a coroutine.

fun main(args: Array<String>) = runBlocking<Unit> {
    val job = launch { doWorld() }
    println("Hello,")
    job.join()
}

// this is your first suspending function
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}