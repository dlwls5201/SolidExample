package beforesolid

data class User(val name: String, var age: Int)

class UserSettings(val user: User) {

    fun changeUserAge(age: Int) {
        if(verifyAgeUpTo19()) {
            user.age = age
            println("user age change : $age")
        }
    }

    fun verifyAgeUpTo19(): Boolean {
        return if(user.age > 19) {
            true
        } else {
            println("error : user age is under 19")
            false
        }
    }
}

fun main() {
    UserSettings(User("BlackJin", 9)).changeUserAge(30)
}
