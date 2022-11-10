package com.beslimir.solid_principles_example.interface_segregation_04

class Segregation02 {
    interface Animal {
        fun eat()
        fun sleep()
    }

    interface FlyingAnimal {
        fun fly()
    }

    class Dog: Animal {
        override fun eat() {
            println("Dog is eating")
        }

        override fun sleep() {
            println("Dog is sleeping")
        }
    }

    class Bird: Animal, FlyingAnimal {
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
}

