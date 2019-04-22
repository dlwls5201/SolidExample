package beforesolid

import java.lang.RuntimeException

open class Rectangle(open val width: Int, open val height: Int) {

    open fun getArea() = width * height
}


internal class Square(
    override val width: Int,
    override val height: Int) : Rectangle(width, height) {

    override fun getArea(): Int {
        return width * width
    }
}

class DoWork {

    fun work() {

        val rectangle = Rectangle(5,4)

        val square = Square(5,4)

        if(isChecked(rectangle)) {
            println(rectangle.getArea())
        } else {
            throw RuntimeException()
        }

        if(isChecked(square)) {
            println(rectangle.getArea())
        } else {
            throw RuntimeException()
        }
    }

    fun isChecked(rectangle: Rectangle) = rectangle.getArea() == 20
}

fun main() {
    DoWork().work()
}