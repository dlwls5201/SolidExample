package aftersolid

/**
 *  개방/페쇄 원칙(Open/Closed Principle)
 *
 *  기존의 코드를 변경하지 않으면서(closed), 기능을 추가할 수 있도록(open) 설계가 되어야 하는 원칙
 */
open class Customer(open val price: Double) {

    open fun giveDiscount() = price
}

class VipCustomer(
    override val price: Double) : Customer(price) {

    override fun giveDiscount(): Double {
        return super.giveDiscount() * 0.8
    }
}

class VVipCustomer(
   override val price: Double) : Customer(price) {

    override fun giveDiscount(): Double {
        return super.giveDiscount() * 0.6
    }
}

class Cashier(val customer: Customer) {

    fun showDiscount() {
        println(customer.giveDiscount())
    }
}

fun main() {

    Cashier(VipCustomer(1000.0)).showDiscount()

    Cashier(VVipCustomer(1000.0)).showDiscount()

}

