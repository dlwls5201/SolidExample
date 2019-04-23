package aftersolid

import aftersolid.SRPExample.*

/**
 *  SRP (Single Responsibility Principle) 단일 책임 원칙
 *
 *  클래스와 메소드는 하나의 역할만 하도록 한다.
 *  단일 클래스는 단 한개의 책임을 가져야 한다 (=클래스를 변경하는 이유는 단 한개여야 한다)
 *
 *  "어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다."
 */
class SRPExample {

    data class User(var name: String, var age: Int)

    class UserSettings(val user: User) {

        fun changeUserName(name: String) {
            if(VerifyUser().verifyAgeUpTo19(user)) {
                user.name = name
                println("user name change : $name")
            }
        }
    }

    class VerifyUser {

        fun verifyAgeUpTo19(user: User): Boolean {
            return if(user.age > 19) {
                true
            } else {
                println("error : user age is under 19")
                false
            }
        }
    }

}

fun main() {
    UserSettings(
        User("BlackJin", 9)).changeUserName("WhiteJin")
}
