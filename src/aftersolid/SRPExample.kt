package aftersolid

/**
 *  단일 책임 원칙 (Single responsibility principle)
 *
 *  단일 클래스는 오직 하나의 일을 가져야 한다.
 */
data class User(var name: String, var age: Int)

class UserSettings(val user: User) {

    fun changeUserName(name: String) {
        if(VerifyUser(user).verifyAgeUpTo19()) {
            user.name = name
            println("user age change : $name")
        }
    }
}

class VerifyUser(val user: User) {

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
    UserSettings(
        User("BlackJin", 9)).changeUserName("WhiteJin")
}
