package com.shriharsh.kotlin.advanced.functions

/**
 * Invoke operator helps in implementing some functionality just by calling the function on the class variable declared
 * check manager class called
 *
 */


class Request1(val method: String, val query: String, val contentType: String)

class Response1(var contents: String, var status: Status1) {

    operator fun invoke(status1: Status1.() -> Unit) {
        //...
    }

}

class Status1(var code: Int, var description: String)

class RouteHandler1(val request: Request1, val response: Response1) {
    var executeNext = false;
    fun next() {
        executeNext = true
    }
}

//function expecting extension on RouteHandler class
fun routeHandler1(path: String, f: RouteHandler1.() -> Unit): RouteHandler1.() -> Unit = f

fun main(args: Array<String>) {

    routeHandler1("/index.html") {
        if (request.query != "") {
            //process
        }

        response.contents = "Not found"

        response {
            code = 404
            description = "Voila"
        }

    }

    //example for the invoke function to understand
    val manager = Manager()
    manager("Do someting")
}

class Manager {
    //this invoke function will be called when a var
    operator fun invoke(something: String) {

    }

}