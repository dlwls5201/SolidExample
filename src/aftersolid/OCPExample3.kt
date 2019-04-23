package aftersolid

import aftersolid.OCPExample3.*

class OCPExample3 {

    interface Shape {
        fun getArea(): Double
    }

    class Rectangle(val width: Double, val height: Double): Shape {

        override fun getArea() = width * height
    }

    class Square(val width: Double): Shape {

        override fun getArea() = width * width

    }

    class Circle(val radius: Double): Shape {

        override fun getArea() = radius * radius * Math.PI
    }

    class AreaCalculator {

        fun getSumArea(shapes: List<Shape>): Double {
            var area = 0.0

            for (shape in shapes) {
                area += shape.getArea()
            }

            return area
        }
    }
}

fun main() {

    val shapes = listOf(Rectangle(4.0, 5.0), Square(5.0), Circle(1.0))

    val areaSum = AreaCalculator().getSumArea(shapes)

    println("areaSum : $areaSum")
}

