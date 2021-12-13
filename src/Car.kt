class Car(val name: String, speed_param: Int) {
    init {
        println("My car $name")
    }

    var color = "blue"

    var speed = speed_param
        set(value) {
            if (value > 0) field = value
        }

    fun drive() {
        println(if (speed > 180) "Turbo" else "loser")
    }
}

fun main(args: Array<String>) {
    val myCar = Car("Toyot)
    myCar.color = "red"
    println("My car $myCar")
    myCar.drive()

}