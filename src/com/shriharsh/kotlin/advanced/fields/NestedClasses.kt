package com.shriharsh.kotlin.advanced.fields

/**
 * - Kotlin allows you to access the nested classes outside as well, without having to create a instance of the outer class
 * - if you do not wish to make them accessible, you can make them private
 * - YOu can access the inner class within Outer class, you need to create a instance of the object and then access it
 */

class DirectoryExplorer {
    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()

        permissionCheck.validatePermission(user)

    }

    //NESTED CLASS
    class PermissionCheck {
        fun validatePermission(user: String) {

        }
    }

    //INNER CLASS
    inner class AnotherPermissionCheck {
        fun validatePermission(user: String) {

        }
    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer()

    de.listFolder("FolderName", "User1")

    //Nested class being accessed
    val pc = DirectoryExplorer.PermissionCheck()

    //But you cannot access inner class, as it will be part of the outer instance, which here is Directory Explorer, so you need to create a instance of
    //it and only then you can access it
//    val apc = DirectoryExplorer.AnotherPermissionCheck()

    val aapc = DirectoryExplorer().AnotherPermissionCheck()

}