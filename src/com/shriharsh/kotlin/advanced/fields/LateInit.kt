package com.shriharsh.kotlin.advanced.fields

/**
 * - Lateinit tells that when the variable is of type interface and it's been used in the code, it tells the
 *      compiler that it will be initialized later
 * - It helps in late initialization of the variable after the constructor has been called and this can be only on the mutable types, otherwise it cannot initialize later
 *
 */

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    //this helps in avoiding to initialize the repository class immediately and also to check if its not null
    lateinit var repository: Repository //lateinit helps in initialization the variable later, if not initialized it would throw compile error related to lateinit

    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {

    val customerController = CustomerController()

    customerController.index()

}