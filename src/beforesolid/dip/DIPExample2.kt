package beforesolid.dip

class DIPExample2 {

    // 저차원 모듈
    class Logger {
        fun logInformation(logInfo: String) {
            println(logInfo)
        }
    }

    // 고차원 모듈
    class Foo {
        // 저차원 모듈을 생성해주어야 하므로 저차원 모듈에 의존하게 된다.
        private val logger = Logger()

        fun doStuff() {
            logger.logInformation("Something important.")
        }
    }
}

fun main() {

    DIPExample2.Foo().doStuff()

}