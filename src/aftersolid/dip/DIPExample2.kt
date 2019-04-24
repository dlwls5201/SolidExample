package aftersolid.dip

import aftersolid.dip.DIPExample2.*

class DIPExample2 {

    interface ILogger {
        fun logInformation(logInfo: String)
    }

    class Logger : ILogger {
        override fun logInformation(logInfo: String) {
            System.out.println(logInfo)
        }
    }

    class Foo {
        private var logger: ILogger? = null

        //Logger 생성하지 않고 외부에서 주입받습니다.
        fun setLoggerImpl(loggerImpl: ILogger) {
            this.logger = loggerImpl
        }

        fun doStuff() {
            logger?.logInformation("Something important.")
        }
    }
}

fun main() {

    val foo = Foo()
    val logger = Logger()

    foo.setLoggerImpl(logger)
    foo.doStuff()
}