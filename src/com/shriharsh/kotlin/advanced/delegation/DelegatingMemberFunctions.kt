package com.shriharsh.kotlin.advanced.delegation

import com.shriharsh.kotlin.advanced.fields.Customer

/**
 * In Kotlin,
 *
 * - With delegation you just need to inject the depepndencies and do not have to pass them as variables
 * - All the methods of the delegate are directly available when you add them to delegation
 * -  You can pass multiple delegations
 *
 */

interface CustomerRepository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logging{
    fun logAll()
}

//Normal Controller
class ControllerBeforeDeleg(val repository: CustomerRepository) {
    fun index() {
        repository.getAll() // to access the function of repository you need repository here
    }
}

class ControllerWithDeleg(repository: CustomerRepository, logging: Logging) : CustomerRepository by repository, Logging by logging {

    fun anotherIndex() {
        //you cannot access repository here
//        repository

        //you can access the methods of the delegates here directly without needing repository as it is already injected
        getAll()

        getById(123)

        logAll()
    }

}