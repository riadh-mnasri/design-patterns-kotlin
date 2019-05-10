package com.wehightech.factory

fun main() {
    val animal = AnimalFactory().createAnimal("cat", "Katty")
    println("animal :: $animal")
}
