package aftersolid

/**
 *  개방/페쇄 원칙(Open/Closed Principle)
 *
 *  기존의 코드를 변경하지 않으면서(closed), 기능을 추가할 수 있도록(open) 설계가 되어야 하는 원칙
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

