package conditionals

fun main(args: Array<String>) {
    val age: Int = 20
    if (age < 18) {
        println("you cannot register")
    } else if (age < 21) {
        println("Well, you can register")
    } else {
        println("you can register")
    }

    val mode: Int = 2
    when (mode) {
        1 -> println(" mode is 1")
        2 -> {
            println("mode is 2")
        }
        3 -> println("mode is 3")
    }
}