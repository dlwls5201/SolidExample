package beforesolid

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
                //TODO snake 추가해주게 되면 animalSound 함수를 수정해 주어야 합니다.
                "snake" -> {
                    println("hiss")
                }
            }
        }
    }
}

fun main() {

    val animals = arrayOf(Animal("lion"), Animal("mouse"))
    MyAnimal(animals).animalSound()

}

