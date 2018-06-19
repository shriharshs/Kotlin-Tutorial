package com.shriharsh.kotlin.advanced.functions


/**
 * - All extension functions have access to the members of the class they are extending
 * - Lambda extensions helps in writing DSLish like language in Kotlin
 *
 */


class Request(val method: String, val query: String, val contentType: String)

class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {
        //...
    }
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false;
    fun next() {
        executeNext = true
    }

}

//function expecting extension on Response class
fun response(response: Response.() -> Unit) {}

//function expecting extension on RouteHandler class
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {

    routeHandler("/index.html") {
        if (request.query != "") {
            //process
        }

        response.contents = "Not found"

        response {
            status {
                code = 404
                description = "Voila"
            }
        }

    }
}