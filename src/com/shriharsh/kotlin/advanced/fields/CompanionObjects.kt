package com.shriharsh.kotlin.advanced.fields

/**
 *
 * In Kotlin -
 * 1. There are no static methods and static classes, if you want to call any method then one can create a top level function and call it with a name of file
 * 2. With companion object, it helps you in creating factory like structure, and with that you can all the methods directly on the class name, like static methods
 * 3. With companion object you need not have to call things like Log.Factory.XXXXX
 * 4. One need not create a object of the class to call the method in it.
 */

class Log {

    object Factory {
        fun createFileLog(fileName: String): Log = Log(fileName)
    }

    companion object AnotherFactory {
        fun createAnotherFileLog(fileName: String): Log = Log(fileName)

        //adding @JvmStatic will help you access this method in JAVA class like normal static method, somethig like Log.yetAnotherCreateAnotherFileLog
        @JvmStatic
        fun yetAnotherCreateAnotherFileLog(fileName: String): Log = Log(fileName)
    }

    constructor(fileName: String) {

    }

}

fun main(args: Array<String>) {

    //You can create the instance of the Log with constructor
    val log = Log("")

    // calling like this is little tedious, so we use companion objects
    val fileLog = Log.Factory.createFileLog("file.txt")

    //using companion object
    val anotherFileLog = Log.createAnotherFileLog("AnotherFile.txt")

    val yetAnotherFileLog = Log.yetAnotherCreateAnotherFileLog("YetAnotherFile.txt")

}