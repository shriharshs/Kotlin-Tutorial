package com.shriharsh.kotlin.basics.inheritance

/**
 * - INHERITANCE
 * 1. In Kotlin, the base class for any class is ANY, like OBJECT in Java
 *
 */

/**
 * By default ANY will be inherited by itself
 *
 */
class AnyExample : Any(){

}

/**
 * - By default types in Kotlin are FINAL, including classes and FINAL classes cannot be inherited.
 * - So, to inherit a class, you always need to make it OPEN
 * - Much like classes, the members you want to override, should also be declared as OPEN
 */
open class Person(){
    open fun example(){

    }

}

/**
 * - To not let functions to override in your extending class, then mark those functions as FINAL as below
 *
 */
open class Customer : Person(){

   final override fun example(){
    }
}


class SpecialCustomer : Customer(){

    //You cannot override here, so it is commented
//    override fun example() {
//        super.example()
//    }
}