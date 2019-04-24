package aftersolid

import java.lang.RuntimeException
import aftersolid.LSPExample.*

/**
 *  LSP (Liskov Substitution Principle) 리스코프 치환 원칙
 *
 *  서브타입은 언제나 자신의 상위 타입으로 교체할 수 있어야 한다.
 *
 *  "서브 타입은 언제나 자신의 기반 타입으로 교체할 수 있어야 한다."
 */
class LSPExample {

    abstract class Shape {

        abstract fun getArea(): Int
    }

    class Rectangle(val width: Int, val height: Int): Shape() {

        override fun getArea() = width * height
    }


    class Square(val width: Int) : Shape() {

        override fun getArea() = width * width
    }

    class DoWork {

        fun work() {

            val rectangle: Shape = Rectangle(5,4)

            if(isCheckedRectangle(rectangle)) {
                println(rectangle.getArea())
            } else {
                throw RuntimeException()
            }


            val square: Shape = Square(5)

            if(isCheckedShape(square)) {
                println(square.getArea())
            } else {
                throw RuntimeException()
            }
        }

        fun isCheckedRectangle(rectangle: Shape) = rectangle.getArea() == 20

        fun isCheckedShape(square: Shape) = square.getArea() == 25
    }

}

fun main() {
    DoWork().work()
}