package beforesolid

import beforesolid.OCPExample1.*

class OCPExample1 {

    class Animal(val name: String)

    class MyAnimal(val animals: Array<Animal>) {

        fun animalSound() {
            for(animal in animals) {
                when(animal.name) {
                    "lion" -> {
                        println("roar")
                    }
                    "mouse" -> {
                        println("squeak")
                    }
                    "snake" -> {
                        println("hiss")
                    }
                }
            }
        }
    }
}

fun main() {

    val animals = arrayOf(Animal("lion"), Animal("mouse"))
    MyAnimal(animals).animalSound()

}

