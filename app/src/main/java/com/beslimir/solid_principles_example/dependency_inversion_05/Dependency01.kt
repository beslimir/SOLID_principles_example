package com.beslimir.solid_principles_example.dependency_inversion_05

class AndroidDeveloper{
    fun developMobileApp(){
        println("Developing Android Application by using Kotlin")
    }
}

class IosDeveloper{
    fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}

fun main(){
    val androidDeveloper = AndroidDeveloper()
    val iosDeveloper = IosDeveloper()

    androidDeveloper.developMobileApp()
    iosDeveloper.developMobileApp()
}