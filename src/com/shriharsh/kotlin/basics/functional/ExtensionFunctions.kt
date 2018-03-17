package com.shriharsh.kotlin.basics.functional


/**
 * - Extension Functions
 * ~ The idea behind extension functions is to extend the class, without having to inherit from it
 * ~ Extension functions are statically resolved
 *
 */

fun String.hello() {
    println("Its me!")
}

fun String.toTitleCase(): String {
    //"this" refers to the instance of the object i'm operating this function on
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

//fun appendSomethingToAllWords(prefix: String): String {
//    return this.split(" ").joinToString(" ") {
//        "$prefix ${it.capitalize()}"
//    }
//}

fun main(args: Array<String>) {
    println("=============Sample Hello============")
    "Hello".hello()

    println("=============To Capitalize============")
    println("This is a string to be Title cased".toTitleCase())

    println("=============Class function extension============")
    val customer = Customer()
    customer.makePreferred("New Version") //If their is a extension function to member function, then member function is definitely going to take preference

    println("=============Extension functions are statically resolved============")
    val class1: BaseClass = InheritedClass()
    class1.extension() // this is statically resolved

    val class2 = InheritedClass()
    class2.extension() // this is not statically resolved

}

class Customer {
    fun makePreferred() {
        println("Customer Version")
    }
}

/**
 * Extension function of above
 *
 */
fun Customer.makePreferred(message: String) {
    println("Extended Version - " + message)
}

open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}
