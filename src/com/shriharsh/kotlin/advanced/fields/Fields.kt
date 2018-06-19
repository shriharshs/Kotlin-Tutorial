package com.shriharsh.kotlin.advanced.fields

/**
 * Kotlin provides auto-backing filed for cases where you want to store the information
 *
 * If auto backing field is not sufficient, then we can use our own private property
 *
 */


class Customer {
    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 100) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val customer = Customer()

    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 200.0
    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 100.0
    println(customer.lastPurchasedAmount)
}