package com.wehightech.factory

class CatFactory {
    fun createCat(id: Int, name: String): Animal {
        return Cat(id, name)
    }
}
