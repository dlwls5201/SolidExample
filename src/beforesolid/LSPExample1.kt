package beforesolid

import java.lang.RuntimeException
import beforesolid.LSPExample.*

class LSPExample {

    open class Rectangle(open val width: Int, open val height: Int) {

        open fun getArea() = width * height
    }


    class Square(
        override val width: Int,
        override val height: Int) : Rectangle(width, height) {

        //super.getArea()를 사용하지 않고 정사각형에 맞게 로직을 수정했습니다.
        //이렇게 하면 상위 타입(Rectangle)의 기능을 제대로 구현하지 못하게 됩니다.
        override fun getArea(): Int {
            //return super.getArea()
            return width * width
        }

    }

    class DoWork {

        fun work() {

            val rectangle = Rectangle(5,4)

            // 사각형은 20의 값이 나옵니다.
            if(isChecked(rectangle)) {
                println(rectangle.getArea())
            } else {
                throw RuntimeException()
            }

            val square = Square(5,4)

            println("square 1 : " + square.getArea())
            println("square 2 : " + (square as Rectangle).getArea())


            // 정사각형은 20의 값이 아닌 5*5=25가 나옵니다.
            if(isChecked(square)) {
                println(square.getArea())
            } else {
                throw RuntimeException()
            }

        }

        //가로 5 세로 4 인 사각형의 넓이는 20압니다.
        fun isChecked(rectangle: Rectangle) = rectangle.getArea() == 20
    }
}


fun main() {
    DoWork().work()
}