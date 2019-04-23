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

        override fun getArea(): Int {
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

            // 정사각형은 20의 값이 안나옵니다.
            if(isChecked(square)) {
                println(rectangle.getArea())
            } else {
                throw RuntimeException()
            }
        }

        //사각형에 가로 5와 세로 4의 값을 넣었으므로 넓이는 무조건 20이 나와야 합니다.
        fun isChecked(rectangle: Rectangle) = rectangle.getArea() == 20
    }
}


fun main() {
    DoWork().work()
}