package beforesolid

interface MacPro {

    fun display()

    fun keyboard()

    fun touchBar()
}

class MacPro2016: MacPro {

    override fun display() {
        println("macPro2016 display")
    }

    override fun keyboard() {
        println("macPro2016 keyboard")
    }

    override fun touchBar() {
        println("macPro2016 touchBar")
    }

}

class MacPro2015: MacPro {

    override fun display() {
        println("MacPro2015 display")
    }

    override fun keyboard() {
        println("MacPro2015 keyboard")
    }

    override fun touchBar() {
        println("...")
    }

}