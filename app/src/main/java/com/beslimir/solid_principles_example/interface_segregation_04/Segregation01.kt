package com.beslimir.solid_principles_example.interface_segregation_04

interface Animal {
    fun eat()
    fun sleep()
    fun fly()
}

class Dog: Animal {
    override fun eat() {
        println("Dog is eating")
    }

    override fun sleep() {
        println("Dog is sleeping")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}

class Bird: Animal {
    override fun eat() {
        println("A bird is eating")
    }

    override fun sleep() {
        println("A bird is sleeping")
    }

    override fun fly() {
        println("A bird is flying")
    }
}