package com.example.madd_lab_01

fun greetings(name: String, age: Int) {
    println("Hello $name! You are $age years old.")

    if (age >= 18) {
        println("You are eligible to apply for a driving license.")
    } else {
        println("You are NOT eligible to apply for a driving license.")
    }
}

fun main() {
    greetings("Hasara", 22)
    greetings("Nimal", 16)
}
