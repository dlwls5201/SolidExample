package beforesolid

/**
 * LSP 원칙이 꺠질 때
 *
 * 1. 타입을 확인하는 기능을 사용한다.
 */
class LSPSample {

    open class Item(val price: Int = 0)

    class SpecialItem: Item()

    class Coupon {
        fun calcuateDiscountAmount(item: Item): Double {

            //타입을 확인 후 형변환 하므로 LSP 위반
            return if (item is SpecialItem) 0.0 else item.price * 0.8

        }
    }

}