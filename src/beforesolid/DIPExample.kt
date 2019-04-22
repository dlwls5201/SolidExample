package beforesolid

class Robot{

    override fun toString(): String {
        return "Robot"
    }
}

class Kid(private val robot: Robot) {

    fun play() {
        println("play toy : $robot")
    }
}

fun main() {

    val toy = Robot()
    val kid = Kid(toy)
    kid.play()
}