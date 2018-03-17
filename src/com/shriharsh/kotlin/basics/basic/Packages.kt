package com.shriharsh.kotlin.basics.basic

import com.shriharsh.kotlin.basics.basic.utils.someUtility
import com.shriharsh.kotlin.basics.basic.utils.anotherUtility as additionalUtility

/*
    Packages in Kotlin
    ~ Packages in Kotlin by default are imported.
    ~ Important functions like println() are by default are imported in any kotlin file and are part of kotlin.io package
    ~ IDE automatically imports the package and the function which you are using, if you want to include everything from a
        particular package/file then you just make it * in front of that package
    ~ You can do NAMED IMPORTS in kotlin as in above example, and this is used to avoid confusion when two different packages have the same
        name of the function names and you can re-assing/change that name lacally to your file
 */
fun main(args: Array<String>) {
    println("Hello World")

    someUtility("Shriharsh")

    additionalUtility("Saboji")
}