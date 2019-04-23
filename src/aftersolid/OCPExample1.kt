package aftersolid

import aftersolid.OCPExample1.*

/**
 *  OCP (Open Closed Principle) 개방 폐쇄 원칙
 *
 *  자신의 확장에는 개방돼 있고, 주변의 변화에 대해서는 폐쇄돼 있어야 한다.
 *
 *  기능을 변경하거나 확장할 수 있으면서 그 기능을 사용하는 코드는 수정하지 않는다
 *
 *  "소프트웨어 엔티티(패키지, 클래스, 모듈, 함수 등)는 확장에 대해서는 개방되어야 하지만,변경에 대해서는 폐쇄되어야 한다."
 */
class OCPExample1 {

    abstract class Animal {

        abstract fun makeSound()
    }

    class Lion: Animal() {

        override fun makeSound() {
            println("roar")
        }
    }

    class Mouse: Animal() {

        override fun makeSound() {
            println("squeak")
        }
    }

    class Snake: Animal() {

        override fun makeSound() {
            println("hiss")
        }
    }

    class MyAnimal(val animals: Array<Animal>) {

        fun animalSound() {
            for(animal in animals) {
                animal.makeSound()
            }
        }

    }

}

fun main() {

    val animals = arrayOf(Lion(), Mouse(), Snake())
    MyAnimal(animals).animalSound()
}

