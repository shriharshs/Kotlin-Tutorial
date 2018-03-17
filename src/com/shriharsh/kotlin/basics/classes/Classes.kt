package com.shriharsh.kotlin.basics.classes

import java.util.*

/*
- Classes
~ Classes need not have class block, just a the keyword class and the name is enough
~ Using var and val you can declare properties
~ Their is no concept of field in Kotlin, everything is a property in Kotlin
~ Their is no new keyword in Kotlin
 */
class Customer {
    //Property
    var id = 0
    var name: String = ""
}

/*
- Constructor class with properties
~ By adding parameters to the constructor of the class, it creates just variables and by adding var keyword to it
    it will create read-write properties to the constructor
~ Its the ability of initializing the properties when you call the constructor
~ You can even remove the body part of the class and still access the properties
 */
class AnotherCustomer(var id: Int, var name: String)

/*
- Default parameters to class
~ Just like functions, one can have default parameters to constructor of class
 */
class DefaultParameteredClass(var id: Int, var addr: String = "Something")

/*
- Init Block
~ any initializtion or checks/logic to the properties can be done using init block
 */
class InitializingClass(var id: Int, var name: String) {
    init {
        //Here we are converting to upper case
        name = name.toUpperCase()
    }
}

/*
- Secondary Constructor
~ A secondary constructor on a class can be called by using the keyword 'constructor', and passing the required arguments to it
~ And it is always impotant to call secondary construcor the base constructor, which is called using 'this' keyword
 */
class SecondaryContructorClass(var id: Int, var name: String) {
    init {
        //Here we are converting to upper case
        name = name.toUpperCase()
    }

    constructor(email: String) : this(0, "Something") {
        // This will be same as init block in the base constructor
    }
}

/*
- Getter Setter for a property
~ One can create a custom getter setter for a property
~ If getter has a single line logic then it can be without a block,
~ If it is a big logic, then it can go in a multiline block
 */
class GetterSetterProperty(val id: Int, var name: String, val yearOfBirth: Int) {

    //Custom getter
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    //Custom setter
    var ssn: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social Security should start with SN")
            }
            //This is a special recognized field in Kotlin called backing field and it is because their is no
            //concept of field in Kotlin, its all property
            field = value
        }

}

/**
 * - functions in a class
 */
class FunctionInAClass(var id: Int, var name: String) {

    fun getPropertiesInString(): String {
        return "Id - $id and Name - $name"
    }
}

/**
 * - Visibility modifiers in Kotlin
 * ~ By default their are 4 visibility modifiers
 *      a. public = accessible anywhere
 *
 *      IN TOP LEVEL DECLARATIONS
 *      a. private = available only inside the file
 *      b. internal = available anywhere in module (module can be anything, gradle, maven etc)
 *
 *      IN CLASS DECLARATIONS
 *      a. private = only available to class members
 *      b. protected = same as private and subclasses
 *      c. internal = any client inside the module
 */

fun main(args: Array<String>) {
    //Creating an instance of the class, where their is no new keyword
    val customer = Customer()

    //Accesing the properties
    customer.id = 10
    customer.name = "Shriharsh"

    val anotherCustomer = AnotherCustomer(100, "Saboji")
    anotherCustomer.id
    anotherCustomer.name

    //Default parameters class
    val defaultParamsClass = DefaultParameteredClass(500)

    //init block use case
    val initBlockClass = InitializingClass(1000, "Shriharsh Saboji")
    println("Customer Name - " + initBlockClass.name)

    //Custom getter setter
    val customGetterSetter = GetterSetterProperty(300, "Shriharsh", 1989)
    customGetterSetter.ssn = "SN1234"
    println("Id - ${customGetterSetter.id}" +
            ", Name - ${customGetterSetter.name}" +
            ", Age - ${customGetterSetter.age}" +
            ", SSN - ${customGetterSetter.ssn}"
    )


    //functions in a class
    val functionsInClass = FunctionInAClass(200, "Shriharsh")
    println(functionsInClass.getPropertiesInString())
}