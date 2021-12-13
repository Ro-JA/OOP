class Car(model_param: String, speed_param: Int, var color: String) {
    val model = model_param.toUpperCase()

    init {
        println("My car $model")
    }

    var speed = speed_param
        set(value) {
            if (value > 0) field = value
        }
    val speedInMil: Double
        get() = speed * 1.6
}

fun main(args: Array<String>) {
    val myCar = Car("toyota", 160, "red")
    println("My car ${myCar.model} ${myCar.speed} ${myCar.color}")
    myCar.speed = 200
    myCar.color = "blue"
    myCar.speedInMil
    println("My car ${myCar.model} ${myCar.speedInMil} ${myCar.color}")

}