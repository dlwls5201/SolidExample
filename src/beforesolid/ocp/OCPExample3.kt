package beforesolid.ocp

import beforesolid.ocp.OCPExample3.*

class OCPExample3 {

    class Rectangle(val width: Double, val height: Double)

    class Square(val width: Double)

    class Circle(val radius: Double)

    class AreaCalculator {
        fun getSumArea(shapes: List<Any>): Double {
            var area = 0.0

            for (shape in shapes) {
                when (shape) {
                    is Rectangle -> {
                        area += shape.width * shape.height
                    }
                    is Square   ->  {
                        area += shape.width * shape.width
                    }
                    is Circle   ->  {
                        area += shape.radius * shape.radius * Math.PI
                    }
                }

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

