package com.shriharsh.kotlin.basics.stdlib

/**
 * LAZY EVALUATOIN is a powerful concept in HASKELL
 *
 */
fun main(args: Array<String>) {

    println("=================LAZY EVALUATION using asSequence()====================")
    //Without Sequence mechanism it will take longer time to evaluate the condition and only print it after completion
    //of the loop,
    //but with asSequence adding, it will immediately print it, check out below, by adding and removing asSequence, but the scanning
    //will keep until it finishes all the elements in the loop
    val elements = 1..10000000000

//    val output = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }
//
//    output.forEach { println(it) }
    // todo above lines are commented because, that will take longer time to evalute and below examples will be blocked

    println("=================LAZY EVALUATION using take====================")
    //above problem can be solved, where you pick only selected range of numbers and act upon it
    val anotherOutput = elements.asSequence().take(30).sum()
    println(anotherOutput)

    println("=================LAZY EVALUATION using generate sequence====================")
    val numbers = generateSequence(1) { x -> x + 10 }
//    numbers.forEach { println(it) }  //This will print all the numbers from above and it wont stop
    println("Total Sum - " + numbers.take(30).sum())


    println("=================LAZY EVALUATION using lazy keyword====================")
    val lazyInit : Int by lazy { 20 } //todo - This will be initialized only when the lazyInit is used, until then it wont be initialized

}