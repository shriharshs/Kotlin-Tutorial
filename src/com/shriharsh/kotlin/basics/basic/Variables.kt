package com.shriharsh.kotlin.basics.basic

fun main(args: Array<String>) {

    var streetNumber: Int
    var streetName: String = "High Street"
    var streetName1 = "High Street"

    val zip = "560054"

    streetName = "Gandhi Bazar"
//    zip = "587314"  //This cannot be done, as this is a immutable value but not a mutable like others


    val myInt: Int = 10
    val myByte: Byte
    val myLong: Long
    val myAnotherLong = 10L //This is done using type inference and avoid declaring types
    val myFLoat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01
    val myDouble: Double


    myLong = myInt.toLong() //Their is not implicit conversion in kotlin, everything is explicitly done

    //=============STRING==============================
    val myChar = 'A'
    val myString = "My String"

    val escapeString = "A new line \n"

    val rawString = "This is line 1" +
            "This is line 2" +
            "This is line 3"

    val multiLines = """
        This is line 1
        This is line 2
        This is line 3 """

    //============STRING INTERPOLATION========================
    val years = 10
    val message = "A decade is $years years"

    val name = "harsh"
    val anotherMessage = "Length of the name is ${name.length}"


}