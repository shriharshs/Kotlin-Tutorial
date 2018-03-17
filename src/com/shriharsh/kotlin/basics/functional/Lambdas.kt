package com.shriharsh.kotlin.basics.functional

/**
 * LAMBDA
 * - Lambdas are very handy in nature
 * - when they are directly part of a parameter, then they need not be assigned with types, as the receiving function will infer it
 *    like on line 17
 * - But if the lambda expression is extracted as a variable, then it has to explicitly be told about types it uses
 *      like in line 20
 * - In Kotlin, like groovy, if the Lambda has a single pararmeter, then we do not have to be explicit, we can use the word "it"
 * - In kotlin, if the function is a higher order function and the function is the last parameter of the function, then you can actually
 *  write the function in way like below example on line 40, This will be very useful in DSL
 *  - Anonymous functions can have multiple return points but Lambdas cant
 *
 * */

fun lambdaOperation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun unaryOp(op: (Int) -> Int) {
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }

}

class Database {
    fun commit() {

    }
}

fun main(args: Array<String>) {

    println("******LAMBDA OPERATION WITHOUT IN A VARIABLE*****")
    println(lambdaOperation(1, 2, { a, b -> a + b }))

    println("******LAMBDA OPERATION WITH VARIABLE*****")
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(lambdaOperation(1, 2, sumLambda))

    println("******LAMBDA OPERATION WITH SINGLE OPERATOR*****")
    println(unaryOperation(2, { x -> x * x }))

    println("******LAMBDA OPERATION WITH IT*****")
    println(unaryOperation(2, { it * it }))

    println("******LAMBDA OPERATION WITH FUNCTION AS LAST PARAMETER*****")
    unaryOperation(2) {
        it * it
    }

    unaryOp { it * it }

    unaryOp {
        3 * 3
    }

    println("******LAMBDA AND DSL LIKE EXAMPLE*****")

    val db = Database()

    transaction(db) {
        //Make your transaction here, by interacting with db
    }

    println("******ANONYMOUS FUNCTIONS*****")

    unaryOperation(3, fun(x: Int): Int { return x * x })


}