package com.shriharsh.kotlin.advanced.fields

/**
 * - With typealias it helps us to give meaningful and symantic types to the varaibles
 *  - Using typealias does not create a new type altogether, its just a alias to the existing type
 *  - At runtime, the typealias will get converted to the original data type used to alias the type
 *
 */

data class EmployeeBeforeTypeAlias(val name: String, val email: String) {
    fun printName(string: String) {
        println(string)
    }
}

typealias Name = String
typealias EmailData = String

data class EmployeeAfterTypeAlias(val name: Name, val email: EmailData) {
    fun printName(string: String) {
        println(string)
    }
}

