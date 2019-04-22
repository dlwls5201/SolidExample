package aftersolid

/**
 * ISP (Interface Segregation Principle) 인터페이스 분리 원칙
 *
 * "클라이언트는 자신이 사용하지 않는 메소드에 의존 관계를 맺으면 안 된다."
 */
interface MacPro {

    fun display()

    fun keyboard()

}

interface MacProTouch {

    fun touchBar()
}


class MacPro2016: MacPro, MacProTouch {

    override fun display() {
        println("macPro2016 display")
    }

    override fun keyboard() {
        println("macPro2016 keyboard")
    }

    override fun touchBar() {
        println("macPro2016 touchBar")
    }

}

class MacPro2015: MacPro {

    override fun display() {
        println("MacPro2015 display")
    }

    override fun keyboard() {
        println("MacPro2015 keyboard")
    }
}