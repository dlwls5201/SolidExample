package aftersolid

/**
 *  OCP (Open Closed Principle) 개방 폐쇄 원칙
 *
 *  자신의 확장에는 개방돼 있고, 주변의 변화에 대해서는 폐쇄돼 있어야 한다.
 *
 *  "소프트웨어 엔티티(패키지, 클래스, 모듈, 함수 등)는 확장에 대해서는 개방되어야 하지만,변경에 대해서는 폐쇄되어야 한다."
 */
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

fun main() {

    val animals = arrayOf(Lion(), Mouse(), Snake())
    MyAnimal(animals).animalSound()
}

