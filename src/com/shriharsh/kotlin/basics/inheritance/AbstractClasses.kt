package com.shriharsh.kotlin.basics.inheritance


/**
 * - Abstract Classes
 * - Same as in Java, you cannot create object of abstract classes here
 *
 */
abstract class StoredEntity() {
    val isActive = true
    abstract fun store()

    fun status(): String{
        return isActive.toString()
    }

}

class Employee : StoredEntity() {
    override fun store() {
        println("Store Something here!!!")
    }

}

fun main(args: Array<String>) {
    val se = Employee()

    se.isActive
    se.status()
    se.store()
}