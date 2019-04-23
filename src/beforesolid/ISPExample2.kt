package beforesolid

class ISPExample2 {

    interface Calculator {

        fun add()

        fun subtract()

        fun multiply()

    }

    class Calculator2015: Calculator {

        override fun add() {
            println("2015 add()")
        }

        override fun subtract() {
            println("2015 substract()")
        }

        override fun multiply() {
            println("...")
        }
    }

    class Calculator2019: Calculator {

        override fun add() {
            println("2019 add()")
        }

        override fun subtract() {
            println("2019 subtract()")
        }

        override fun multiply() {
            println("2019 multiply()")
        }
    }
}

fun main() {

}
