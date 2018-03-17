package com.shriharsh.kotlin.basics.basic

/**
 * KOTLIN ALLOWS YOU TO HAVE MAIN FUNCTION PER FILE,
 * THAT IS REALLY VALID
 *
 */

fun main(args: Array<String>) {

    println("==========Normal loop with .. and variable declared=============")
    for(a: Int in 1..10){
        println(a)
    }

    println("==========Normal loop with .. and implicit variable=============")
    for (b in 20..30) {
        println(b)
    }

    println("==========Normal loop with .. and variable defined=============")
    val numbers  = 30..40

    for(e in numbers){
        println(e)
    }

    println("==========Reverse loop with ..=============")
    for(c in 30..1){
        println(c)
    }

    println("==========Reverse loop with down to=============")
    for(d in 20 downTo 10){
        println(d)
    }

    println("==========Reverse loop with down to and in steps=============")
    for(d in 30 downTo 10 step 2){
        println(d)
    }


    println("==========Looping on array of strings=============")
    val capitals = listOf("London", "Madrid", "Delhi","Rome")
    for(capital in capitals){
        println(capital)
    }

    println("==========Looping using WHILE=============")
    var e = 100
    while (e > 10){
        e--
    }

    println("==========Looping using DO WHILE=============")
    do {
        var f = 10
        f--
    }while (f > 10)

    println("==========Looping using FOR loop and breaking at a label=============")
    loop1@ for (g in 50..60){
        for (h in 50..60){
            if (h % g == 0){
                break@loop1
                // Or else you can make it continue and skip the iteration
                //continue
            }
        }
    }

}
