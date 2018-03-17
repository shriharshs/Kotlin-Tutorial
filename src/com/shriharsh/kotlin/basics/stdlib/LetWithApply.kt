package com.shriharsh.kotlin.basics.stdlib

import java.io.File

fun main(args: Array<String>) {


    val file = File("filename.txt")

    //Using "with" you can perform all the in-built actions on the specific object
    with(file){
        isAbsolute
        isDirectory
    }

    //Using "let" you can perform all the in-built actions on the specific object
    val string : String? = "Some Value"

    string?.let {
        println(it.length)
    }


}