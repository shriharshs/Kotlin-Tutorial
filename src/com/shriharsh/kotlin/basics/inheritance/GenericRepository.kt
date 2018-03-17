package com.shriharsh.kotlin.basics.inheritance

class GenericRepository<T> : Repository<T> {
    override fun getAll(): List<T> {
        return listOf()
    }

//    override fun getById(id: Int): T {
//        return
//    }
}