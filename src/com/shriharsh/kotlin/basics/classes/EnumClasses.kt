package com.shriharsh.kotlin.basics.classes

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "[MINOR PROPERTY]"
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "[NORMAL PROPERTY]"
        }
    },
    MAJOR(1) {
        override fun text(): String {
            return "[MAJOR PROPERTY]"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            return "[CRITICAL PROPERTY]"
        }
    };

    abstract fun text(): String
}


fun main(args: Array<String>) {
    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)
    println(priority.ordinal)
    println(Priority.CRITICAL.name)

    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)

    println(Priority.MINOR.text())
}