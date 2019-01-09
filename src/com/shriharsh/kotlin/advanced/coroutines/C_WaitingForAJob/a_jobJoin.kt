package com.shriharsh.kotlin.advanced.coroutines.C_WaitingForAJob

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//Delaying for a time while another coroutine is working is not a good approach.
//Let's explicitly wait (in a non-blocking way) until the background Job that we have launched is complete:

//Now the result is still the same, but the code of the main coroutine is not tied to the duration of the background job in any way.

fun main(args: Array<String>) = runBlocking<Unit> {
    val job = launch {
        // launch new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes
}