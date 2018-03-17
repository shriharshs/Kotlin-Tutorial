package com.shriharsh.kotlin.basics.classes

import java.io.IOException

/**
 * - DATA CLASSES
 * ~ By adding 'data' keyword to the class, you can by default add the properties to a class, which are equivalent to
 *   a bean class in Java
 * ~ You get functionalities like toString(), hashCode(), equals() by default, which is implemented in CustomerJava class
 * ~ Data classes by default gives COPY functionality.
 * ~ With default COPY functionality, you can also override the values of the parameters
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    //=========This is used in Interop session in Talking to Kotlin============
    @JvmField
    val someField = "Value"

    @JvmOverloads
    fun changeStatus(status: Status = Status.CURRENT) {
        //DO SOMETHING HERE
    }

    //This is like giving a alias name to the function, when called from Java class
    @JvmName("preferrential")
    fun makePreferred() {
        //DO SOMETHING HERE
    }

    @Throws(IOException::class)
    fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be empty")
        }
    }

    //=========================================================================
}

//=========This is used in Interop session in Talking to Kotlin============
enum class Status {
    CURRENT,
    PAST
}

fun CustomerKotlin.extension() {
    //DO SOMETHING HERE
}
//=========================================================================

/**
 * - One can override the existing functionality as well
 * - Below is the class with overrided toString() method
 */
class OverridedDataClass(var id: Int, var name: String, var email: String) {

    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$id\", \"name\": \"$name\", \"email\": \"$email\"}"
    }
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(100, "Shriharsh", "mail@mail.com")

    //Just by printing the object you get all the details of the object, which is not possible with normal class objects, which
    //gives you the object address
    println(customer1)

    println("===============================================")

    //EQUALITY FUNCTIONALITY CHECK FOR DATA CLASSES, WHICH IS DERFAULT IMPLEMENTED
    //WHICH REALLY HELPS IN SAVING FROM BOILERPLATE CODE FROM CustomerJava class
    val customer2 = CustomerKotlin(200, "Shriharsh", "mail@mail.com")
    val customer3 = CustomerKotlin(200, "Shriharsh", "mail@mail.com")

    if (customer2 == customer3) {
        println("They are same!")
    }

    println("===============================================")

    //COPY FUNCTIONALITY
    val customer4 = customer2 // here all the data of customer2 is copied in customer4
    println("Customer 4 copied details from 2 - " + customer4)

    println("===============================================")

    //OVERRIDING THE PARAMETERS WHEN COPYING THE OBJECTS
    val customer5 = customer3.copy(email = "shriharshs@gmail.com");
    println("Customer 5 copied details from 3 with email overrided = " + customer5)

    println("===============================================")

    //OVERRIDED DEFAULT METHODS
    val overridedDataClass = OverridedDataClass(400, "HArsh", "something@email.com")
    println("Overrided toString() method from default data class = " + overridedDataClass)


}