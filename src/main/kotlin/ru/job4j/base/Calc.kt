package ru.job4j.base

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

fun multiply(first: Int, second: Int): Int {
    return first * second
}

fun divide(first: Double, second: Double): Double {
    return first / second
}


fun main() {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val multiply = multiply(5, 5)
    println("5 * 5 = $multiply")

    val divide = divide(10.0, 2.5)
    println("10 / 2.5 = $divide")
}
