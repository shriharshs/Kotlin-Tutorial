package com.shriharsh.kotlin.advanced.coroutines.E_CoroutineAreLightWeight

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//It launches 100K coroutines and, after a second, each coroutine prints a dot.
//Now, try that with threads. What would happen? (Most likely your code will produce some sort of out-of-memory error)



fun main(args: Array<String>) = runBlocking<Unit> {
    val jobs = List(100_000) { // launch a lot of coroutines and list their jobs
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() } // wait for all jobs to complete
}