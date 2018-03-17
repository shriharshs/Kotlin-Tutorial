package com.shriharsh.kotlin.basics.titBits

/**
 * SMART CAST
 * - IN Kotlin smart casting is done automatically by compiler, rather than doing explicit type casing as in Java
 * - Check hasVaction function, like, when you're checking if the obj is of type Employee, then automatically the vacationDays function
 *      can be invoked without even casting
 *
 */

open class Person {

}

class Employee : Person() {
    fun vacationDays(days: Int){
        if (days < 60){
            println("You need more vacation!")
        }

    }
}

class Contractor : Person(){

}


fun hasVaction(obj: Person){
    if (obj is Employee){
        obj.vacationDays(20)
    }else{
        //You do not get the vacationDays function access here!
        obj
    }
}

var input : Any = 10

fun main(args: Array<String>) {
    //***** This is a wrong casting, but we do not know what to be casted here, so to handle this safely, we can again use ?
    //By using ?, it actually tells, I'm trying to cast this to String, try and check if, possible, otherwise dont cast it
    val str = input as? String

    //This will throw ClassCastException, and since we added ? above for 'as', so this can potentially be null,
    //so to handle that we need to use ? here as well
    println(str?.length)
}