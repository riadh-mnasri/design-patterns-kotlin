package com.wehightech.factory

class DogFactory {
    fun createDog(id: Int, name: String): Animal {
        return Dog(id, name)
    }
}
