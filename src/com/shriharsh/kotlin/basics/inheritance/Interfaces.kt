package com.shriharsh.kotlin.basics.inheritance

/**
 * - Interfaces
 * - Its just as the contract as in Java
 * - Default implementations can be added to a Interface in Kotlin, as like in Java 8, they were earlier called TRAITS as like in SCALA
 * - With default implementation, then what is the difference betn Abstract class and Interface in Kotlin, well, you can maintain the
 *      state with properties in Abstract class, like 'isActive' property in AbstractClasses.kt file, where as you cannot maintain the
 *      state in Interfaces in Kotlin
 *  - Properties in Interfaces are always Abstract, you cannot initialize a value to them, because interface cannot maintain state
 *  - However you can provide getters and setters, like for anothrEmpty value, whose value is always true
 *  - you ca override the property and default implementation of the functions
 */
interface CustomerRepository {
    //You cannot maintain a state here, so it is commented
//    val isEmpty: Boolean = true

    val anotherEmpty: Boolean
        get() = true

    fun getId(id: Int): Customer

    fun store(obj: Customer) {
        //This method will store the customer object
    }
}

class SQLCustomerRepository : CustomerRepository {
    override fun getId(id: Int): Customer {
        return Customer()
    }

    //Overriding the anotherEmpty property, which is always true!
    override val anotherEmpty: Boolean
        get() = false

    override fun store(obj: Customer) {
        //Do my own custom implementations
    }

}

interface Interface1 {
    fun funA() {
        println("Fun A from Interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from Interface 2")
    }
}

/**
 * - If both the interfaces have same default implementation, then when the class implementing both the interface wants to call the default
 *      implementation of the one of the Interface then it will be in ambiguity, but this problem can be solved using below way
 *      super<INTERFACE-NAME>.FUNCTION-NAME()
 *
 */
class Class1And2 : Interface1, Interface2 {
    override fun funA() {
        super<Interface2>.funA()
    }

}

fun main(args: Array<String>) {
    val class1and2 = Class1And2()
    class1and2.funA()
}