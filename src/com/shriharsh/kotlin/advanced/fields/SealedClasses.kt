package com.shriharsh.kotlin.advanced.fields

/**
 * A very common thing in functional programming is Algebraic Data types, ex a boolean can be true or false
 *
 * in Kotlin, to achieve algebraic data types, we have Sealed Classes
 *
 * - Sealed classes have to be located within the same file, you cannot access the sealed class outside the file
 *
 */

//This class can be accessed outside this file
open class PageResultBeforeSealed() {

}

class Success(val content: String) : PageResultBeforeSealed()
class Error(val code: Int, val message: String) : PageResultBeforeSealed()

//But this class cannot be accessed this file
sealed class PageResultWithSealed() {

}

class SuccessWithSealed(val content: String) : PageResultWithSealed()
class ErrorWithSealed(val code: Int, val message: String) : PageResultWithSealed()


fun getURLPageBeforeSealed(url: String): PageResultBeforeSealed {

    //this some dummy value
    val wasValidCall = false

    if (wasValidCall) {
        return Success("The Content")
    } else {
        return Error(404, "Some Error")
    }
}

fun getURLPageAfterSealed(url: String): PageResultWithSealed {

    //this some dummy value
    val wasValidCall = false

    if (wasValidCall) {
        return SuccessWithSealed("The Content")
    } else {
        return ErrorWithSealed(404, "Some Error")
    }
}

fun main(args: Array<String>) {
    val pageResultBeforeSealed = getURLPageBeforeSealed("/")

    when (pageResultBeforeSealed) {
        is Success -> println(pageResultBeforeSealed.content)
        is Error -> println(pageResultBeforeSealed.message)
    }

    val pageResultWithSealed = getURLPageAfterSealed("/")

    when (pageResultWithSealed) {
        is SuccessWithSealed -> println(pageResultWithSealed.content)
        is ErrorWithSealed -> println(pageResultWithSealed.message)
    }


}
