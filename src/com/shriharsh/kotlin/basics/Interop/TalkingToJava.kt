package com.shriharsh.kotlin.basics.Interop

import com.shriharsh.kotlin.basics.classes.CustomerJava

/**
 * INTEROPERABILITY
 *
 * ~ In interop, when accesing the class of Java, though it has private member properties, you can access as properties in Kotlin
 *
 */
fun main(args: Array<String>) {

    val customeer = CustomerJava()

    customeer.email = "shriharsh@saboji.com"

    customeer.prettyPrint() // though the return type is Void in Java class, iy shows Unit in Kotlin

}

/**
 * You can extend a Java class in Kotlin class too, though they are not defined as Open class in Java
 *
 */
class PersonKotlin : PersonJava() {

}

class KotlinCustomerRepo : AnotherCustomerRepo {
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}