open class Automobile {
    open val model = ""
    open val engine = ""
    open val transmission = ""
    var color = ""

    open fun drive() {
        println("The Automobile is driving")
    }

    open fun beep() {
        println("The Automobile is beeping")
    }

    open fun autopilot() {
        println("The Automobile on autopilot")
    }
}

open class PassengerCar : Automobile() {

}