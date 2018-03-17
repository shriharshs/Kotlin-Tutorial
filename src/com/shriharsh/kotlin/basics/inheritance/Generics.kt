package com.shriharsh.kotlin.basics.inheritance

import com.shriharsh.kotlin.basics.classes.Customer

interface Repository<T> {
//    fun getById(id: Int): T
    fun getAll(): List<T>
}


fun main(args: Array<String>) {
    val customerRepository = GenericRepository<Customer>()

    val customer = customerRepository.getAll()
}

