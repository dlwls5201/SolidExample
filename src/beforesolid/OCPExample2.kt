package beforesolid

class Customer(val grade: String, val price: Double)

class Cashier(val customer: Customer) {

    fun giveDiscount(): Double {
        return when(customer.grade) {
            "vip"   -> {
                customer.price * 0.8
            }
            //TODO vvip 추가해주게 되면 giveDiscount 함수를 수정해 주어야 합니다.
            "vvip"   -> {
                customer.price * 0.6
            }
            else    -> {
                customer.price
            }
        }
    }

    fun showDiscount() {
        println(giveDiscount())
    }
}

fun main() {

    Cashier(Customer("vip", 1000.0)).showDiscount()

    Cashier(Customer("vvip", 1000.0)).showDiscount()
}

