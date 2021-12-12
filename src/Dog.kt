class Dog(val name: String, weight_param: Int, breed_param: String) {
    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!!!" else "Woof!!!")
    }
}

fun main(args: Array<String>) {
    val myDog = Dog("Fido", 40, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in kgs ${myDog.weightInKgs}")
    myDog.weight = - 2
    myDog.activities = arrayOf ("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dog("Sofi", 5, "Toyterier"), Dog("Myxtar", 39,
        "Dvorniga"))
    dogs[1].bark()
    dogs[1].weight = 6
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}