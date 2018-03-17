package com.shriharsh.kotlin.basics.stdlib

/**
 * - KOTLIN by itself does not have any collections of its own, but it has interfaces called "Mutable" and
 *      "Immutable" interfaces
 *
 */

fun main(args: Array<String>) {

    //==================IMMUTABLE LIST=========================================
    //Empty list
    var emptyList = emptyList<String>()

    //listOf is a handy function, and is by default its a IMMUTABLE list
    var list = listOf("First", "Second")

    //with immutable list, you cannot add/delete any element from it, its just read-only
    val cities = listOf("Bengaluru", "Pune")

    //==================MUTABLE LIST=========================================
    val mutableList = mutableListOf<String>("Hyderabad")

    mutableList.add("Coimbatore")

    //==================HASH MAP=========================================
    val hashMap = hashMapOf(Pair("Delhi", "India"), Pair("Lahore", "Pakistan"))

    //==================PRIMITIVE ARRAYS=========================================
    val booleans = booleanArrayOf(true, false, false)
    val characters = charArrayOf('A', 'B', 'C')
}