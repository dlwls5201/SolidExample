package aftersolid

/**
 *  SRP (Single Responsibility Principle) 단일 책임 원칙
 *
 *  클래스와 메소드는 하나의 역할만 하도록 한다.
 *
 *  "어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다."
 */
data class User(var name: String, var age: Int)

class UserSettings(val user: User) {

    fun changeUserName(name: String) {
        if(VerifyUser(user).verifyAgeUpTo19()) {
            user.name = name
            println("user name change : $name")
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
