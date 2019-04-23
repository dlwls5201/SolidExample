package aftersolid

class LSPExample2 {

    open class Item(val price: Int = 0) {

        open fun isDiscountAvailable() = true
    }

    class SpecialItem: Item() {

        override fun isDiscountAvailable() = false
    }

    class Coupon {
        fun calcuateDiscountAmount(item: Item): Double {

            //is 연산자 제거
            return if (item.isDiscountAvailable()) 0.0 else item.price * 0.8

        }
    }

}

fun main() {

    //...
}