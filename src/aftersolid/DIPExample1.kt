package aftersolid

import aftersolid.DIPExample1.*

/**
 * DIP (Dependency Inversion Principle) 의존 역전 원칙
 *
 * "고차원 모듈은 저차원 모듈에 의존하면 안 된다. 이 두 모듈 모두 다른 추상화된 것에 의존해야 한다."
 *
 * "추상화된 것은 구체적인 것에 의존하면 안된다. 구체적인 것이 추상화된 것에 의존해야 한다."
 *
 * "자주 변경되는 구체(Concrete) 클래스에 의존하면 안된다."
 *
 * -> 자신보다 변하기 쉬운 것에 의존하지 마라.
 *
 * -> 자신보다 변하기 쉬운 것에 의존하던 것을 추상화된 인터페이스나 상위 클래스를 두어 변하기 쉬운 것의 변화에 영향받지 않게 하는 것이 의존 역전 원칙이다.
 */
class DIPExample1 {

    open class Toy

    class Robot: Toy() {

        override fun toString(): String {
            return "Robot"
        }
    }

    class Dinosaur: Toy() {

        override fun toString(): String {
            return "Dinosaur"
        }
    }

    class Kid(private val toy: Toy) {

        fun play() {
            println("play toy : $toy")
        }
    }

}

fun main() {

    val robot = Robot()
    val Dinosaur = Dinosaur()

    //robot 과 Dinosaur 를 선택해서 아이에게 줄 수 있다.
    val kid = Kid(robot)
    kid.play()
}