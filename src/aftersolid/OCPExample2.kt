package aftersolid

/**
 *  OCP (Open Closed Principle) 개방 폐쇄 원칙
 *
 *  자신의 확장에는 개방돼 있고, 주변의 변화에 대해서는 폐쇄돼 있어야 한다.
 *
 *  "소프트웨어 엔티티(패키지, 클래스, 모듈, 함수 등)는 확장에 대해서는 개방되어야 하지만,변경에 대해서는 폐쇄되어야 한다."
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

