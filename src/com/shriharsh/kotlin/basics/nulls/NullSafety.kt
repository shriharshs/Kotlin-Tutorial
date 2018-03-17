package com.shriharsh.kotlin.basics.nulls


/**
 * Null Safe
 * - By default in Kotlin it is Null Safe
 *
 *
 */
fun main(args: Array<String>) {

    val message = null // This is ok to have but not recommended

    val anotherMessage: String = "Another message" // typical String assignment

    //Since this will show error, so it is commented!
    //***** This is NOT POSSIBLE! Because, Kotlin is Null safe, which means, types cannot be null
//    val oneMoreMessage : String = null

    //***** What if I want to work with null, because since it is interoperable with Java, so their is a chance
    //that Java can produce NULL, see below how can we use that
    //One can declare a type as null, by using ?
    val nullMessage: String? = null
    val inferredMessage = null

    //This is just like typical Java procedure to check for NULL
    if (nullMessage != null) {
        println(nullMessage.length)
    }

    //***** Null Safe Operator ?
    //*****The above cumbersome procedure of checking if not equal to null,
    // can be easily solved in a Kotlin way, just by putting the ? before calling any member function or member property on that!
    println(nullMessage?.length)

    //*****The below example is to check multiple nulls on a single statement, rather than having multiple IF conditions
    val sp = createServiceProvide()

    //This is called SAFE operator in Kotlin, for checking null
    sp?.createService()?.evaluate()

    //Non-Null operator !!
    //Using !! is just means that you're telling compiler that, dont worry if null pointer exception is thrown, but I want to use it
    //without checking null
    println(nullMessage!!.length) //This will show Null Pointer Exception
}

fun createServiceProvide(): ServiceProvider? = ServiceProvider()

class Service {
    fun evaluate() {

    }
}

class ServiceProvider {
    fun createService(): Service? {
        return Service()
    }
}