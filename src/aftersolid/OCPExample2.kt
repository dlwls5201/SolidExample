package aftersolid

import aftersolid.OCPExample2.*

class OCPExample2 {

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

}

fun main() {

    Cashier(VipCustomer(1000.0)).showDiscount()

    Cashier(VVipCustomer(1000.0)).showDiscount()

}

