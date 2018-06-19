package com.shriharsh.kotlin.advanced.generics

open class Entity(val id: Int)

class Repository<T : Entity> {

    fun save(entity: T) {
        if (entity.id != 0) {
            // do something
        }
    }

}


fun main(args: Array<String>) {
    val repo = Repository<CustomerRepo>()
}

class CustomerRepo : Entity(id = 0) {

}
