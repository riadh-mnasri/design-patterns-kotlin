package com.wehightech.factory

class AnimalFactory {

    var counter = 0
    private val dogFactory = DogFactory()
    private val catFactory = CatFactory()

    fun createAnimal(animalType: String, name: String): Animal{
        return when(animalType) {
            "cat" -> catFactory.createCat(++counter, name)
            "dog" -> dogFactory.createDog(++counter, name)
            else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}
