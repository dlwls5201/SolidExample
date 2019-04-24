package beforesolid.srp

import beforesolid.srp.SRPExample.*

class SRPExample {

    data class User(var name: String, var age: Int)

    class UserSettings(val user: User) {

        fun changeUserName(name: String) {
            if (verifyAgeUpTo19()) {
                user.name = name
                println("user name change : $name")
            }
        }

        fun verifyAgeUpTo19(): Boolean {
            return if (user.age > 19) {
                true
            } else {
                println("error : user age is under 19")
                false
            }
        }
    }
}

fun main() {
    UserSettings(User("BlackJin", 9)).changeUserName("WhitJIn")
}


