package com.shriharsh.kotlin.basics.titBits

import com.shriharsh.kotlin.basics.classes.CustomerKotlin

/**
 * TUPLES
 * - If we had to return multiple values from a function, how do we do it?
 *  a. By using Pairs
 *  b. Triples
 *  c. Anything more than that, you need to have a Data class
 *
 * DECONSTRUCTING VALUES
 * - with groqing number of values in pairs and triples, you will not come to know, which value is assigned to which parameter
 * - So ease that, we have deconstructing values
 *
 */

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("India", 3000000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("India", "Asia", 3000000)
}

fun main(args: Array<String>) {

    //PAIRS AND TRIPLES
    val result = capitalAndPopulation("India")
    println("===========PAIRS============")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("India")

    println("===========TRIPLES============")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    //DECONSTRUCTING VALUES
    //This is possible because of components concept, every value in a pair or a triple is assigned with a component
    //and that component is assigned to that particular deconstructed value respectively
    println("===========DECONSTRUCTING VALUES============")
    val (country, population) = capitalAndPopulation("India")
    println(country)
    println(population)

    val (country1, continent1, population1) = countryInformation("India")
    println(country1)
    println(continent1)
    println(population1)

    println("===========DECONSTRUCTING VALUES OF A DATA CLASS============")

    val customerKotlin = CustomerKotlin(100, "Shriharsh", "email@email.com")
    //these values can be printed, but we are printing the same values using deconstructed values below
    customerKotlin.id
    customerKotlin.name
    customerKotlin.email

    val (id, name, email) = CustomerKotlin(100, "Shriharsh", "email@email.com")
    println(id)
    println(name)
    println(email)

    println("===========DECONSTRUCTING VALUES IN FOR LOOP============")
    val listCapitalsAndCountries = listOf(Pair("Delhi", "India"), "Paris" to "Spain") // Second one is same as Pair

    for ((capital, country) in listCapitalsAndCountries) {
        println(capital)
        println(country)
    }
}