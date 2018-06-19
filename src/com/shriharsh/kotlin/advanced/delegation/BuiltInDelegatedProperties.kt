package com.shriharsh.kotlin.advanced.delegation

import kotlin.properties.Delegates

/**
 *
 * Built in delegation are used in property change notification, which is implemented in Kotlin using observable delegate
 *
 * Other built in delegation properties are notnull, vetoable, observable etc
 *
 */

data class Employee(val name: String, val email: String) {
    var department: String by Delegates.observable("", { property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    })

    fun printName(string: String) {
        println(string)
    }
}

fun main(args: Array<String>) {

    val employee = Employee("Shriharsh", "email@email.com")

    employee.department = "IT"

}
