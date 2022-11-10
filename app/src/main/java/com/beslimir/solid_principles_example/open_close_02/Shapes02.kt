package com.beslimir.solid_principles_example.open_close_02

import java.util.*


interface Shape {
    fun getArea(): Double
}

class Rectangle : Shape {
    private var length = 0.0
    private var height = 0.0

    override fun getArea(): Double {
        return length * height
    }
}

class Circle : Shape {
    private var radius = 0.0

    override fun getArea() : Double {
        return radius * radius * Math.PI
    }
}

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area: Double = 0.toDouble()
        for (shape in shapes) {
            area += shape.getArea()
            //something is wrong here...
        }
        return area
    }
}



