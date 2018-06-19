package com.shriharsh.kotlin.advanced.delegation

import kotlin.properties.Delegates

class Veto{
    var value: String by Delegates.vetoable("String", {property, oldValue, newValue ->
        newValue.startsWith("S")
    } )
}

fun main(args: Array<String>) {
    val veto = Veto()

    println(veto.value)

    veto.value = "London"
    println(veto.value)

    veto.value = "Sydney"
    println(veto.value)
}