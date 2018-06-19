package com.shriharsh.kotlin.advanced.fields

/**
 * In kotlin, if you do not want to let the client to create an instance of the class, then hide the constructor by making it private
 *
 */
class AnotherLog private constructor() {

    object Factory {
        fun createFileLog(fileName: String): Log = Log(fileName)
    }
}

fun main(args: Array<String>) {
    //BY HAVING THE CONSTRUCTOR AS PRIVATE you cannot instantiate the object of notherLog class
    //  val anotherLog = AnotherLog()

}