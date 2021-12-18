open class Automobile {
    open val model = ""
    open val engine = ""
    open val transmission = ""
    open var color = ""

    open fun drive() {
        println("The Automobile is driving")
    }

    open fun beep() {
        println("Beep! Beep!")
    }

    open fun autopilot() {
        println("The Automobile on autopilot")
    }
}

open class PassengerCar : Automobile() {
    override val engine = "petrol"

    override val transmission = "front-wheel drive"


    override fun beep() {
        println("Pee! Pee!")
    }
}

open class CargoCar : Automobile() {

    override val engine = "diesel"

    override val transmission = "four-wheel drive"

    override fun beep() {
        println("Fa! Fa!")
    }
}

class Toyota : PassengerCar() {
    override val model: String
        get() = "ist".toUpperCase()

    override var color = "blue"
    override fun drive() {
        println("The $model color $color a transmission $transmission is driving")
    }
}

class Nissan : CargoCar() {
    override val model: String
        get() = "titan".toUpperCase()
    override var color = "green"
    override fun drive() {
        println("The $model color $color a transmission $transmission is driving")
    }
}

class Mechanic {
    fun paint(auto : Automobile) {
        println("${auto.color}")
    }
}

fun main(args: Array<String>) {
    val cars = arrayOf(Toyota(), Nissan())
    for (item in cars) {
        item.drive()
        item.beep()
    }

    val mech = Mechanic()
    val ist = Toyota()
    val titan = Nissan()
    mech.paint(ist)
    mech.paint(titan)



}
