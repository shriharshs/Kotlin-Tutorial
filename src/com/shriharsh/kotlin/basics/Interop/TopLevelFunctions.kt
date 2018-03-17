//@file:JvmName("UtilityClass")
package com.shriharsh.kotlin.basics.Interop

/**
 * - Top Level Functions class is basically a Static class with all static functions and it can be accessed using fileName#functionName in Java
 * - It can be given a seperate name too using filename:@JvmName("UtilityClass"), check above how its declared
 * - Using "const" keyword, it can be used as constant field in Java class
 */

val copyRightYear = 2016

const val lastCopyRightYear = 2015

fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}