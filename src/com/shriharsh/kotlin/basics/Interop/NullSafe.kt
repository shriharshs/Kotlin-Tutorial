package com.shriharsh.kotlin.basics.Interop

import com.shriharsh.kotlin.basics.classes.CustomerJava

/**
 * Null Safe
 *
 * ~ Kotlin is always NULL SAFE, but when used in Interop mode it can potentially be NULL when anything coming from Java,
 *   so to understand which can be NULL, their is something called Platform types, which indicates a return type with !
 *   ex. in the below code, when you call sometimesNull() on customer object, during auto complete, it shows "String!", this is
 *   platform type.
 *
 * ~ On the other hand, when you know that a particular function will never return NULL, then you can annotate that function with
 *  @NotNull (which is JetBrains anotation), in your java code and then it would not show platform type when auto completing
 *
 *
 *
 */

fun main(args: Array<String>) {

    val customer = CustomerJava()

    //Check for String! when auto-completing
    customer.sometimesNull()

    //neverNull() is declared as @NotNull in the CustomerJava, so it will not show platform type
    customer.neverNull()

}