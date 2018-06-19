package com.shriharsh.kotlin.advanced.delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Service {
    var someProperty: String by ExternalFunctionality()
}


/**
 * Here getter and setter value for someProperty is externalized, so that this class can be reused with some other properties
 * of different classes
 *
 */
class ExternalFunctionality : ReadWriteProperty<Service, String> {
    var backingField = "Default"

    override fun getValue(thisRef: Service, property: KProperty<*>): String {
        println("getvalue called with params: \n" +
                "service:  $thisRef\n" +
                "property: ${property}")

        return backingField
    }

    override fun setValue(thisRef: Service, property: KProperty<*>, value: String) {
        backingField = value
    }

}


fun main(args: Array<String>) {
    val service = Service()

    println(service.someProperty)
    service.someProperty = "New Value"
    println(service.someProperty)
}