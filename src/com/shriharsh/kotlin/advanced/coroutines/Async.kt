package com.shriharsh.kotlin.advanced.coroutines

import kotlinx.coroutines.experimental.async
import java.util.concurrent.CompletableFuture

private fun startLongAsyncOperation(v: Int) = CompletableFuture.supplyAsync {
    Thread.sleep(1000)
    "Result : $v"
}

fun main(args: Array<String>) {
    val future = async<String> {
        (1..5).map {
            (startLongAsyncOperation(it))
        }.joinToString("\n")
    }

    println("This Before")
    println(future.getCompleted())
    println("This After")

}