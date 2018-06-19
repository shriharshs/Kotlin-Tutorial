package com.shriharsh.kotlin.advanced.functions

data class Time(val hours: Int, val mins: Int) {
   operator  fun plus(time: Time): Time {
        val minutes = this.hours + time.hours
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes

        return Time(hours, remainingMinutes)
    }
}

fun main(args: Array<String>) {
    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)

}