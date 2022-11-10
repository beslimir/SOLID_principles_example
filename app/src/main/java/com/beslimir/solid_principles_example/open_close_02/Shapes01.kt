package com.beslimir.solid_principles_example.open_close_02

class Shapes01 {
    class Rectangle {
        var length: Double = 0.0
        var height: Double = 0.0
    }

    class Circle {
        var radius: Double = 0.0
    }

    class AreaFactory {
        fun calculateArea(shapes: ArrayList<Any>): Double {
            var area = 0.0
            for (shape in shapes) {
                if (shape is Rectangle) {
                    var rect = shape as Rectangle
                    area += (rect.length * rect.height)
                } else if (shape is Circle) {
                    var circle = shape as Circle
                    area += circle.radius * circle.radius * Math.PI
                } else {
                    throw RuntimeException("Shape not supported")
                }
            }

            return area
        }
    }
}