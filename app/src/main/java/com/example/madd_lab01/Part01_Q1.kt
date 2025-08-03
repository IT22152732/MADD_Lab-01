package com.example.madd_lab01



fun whoAmI(param: Any): String {
    return param::class.simpleName ?: "Unknown"
}

fun main() {
    println(whoAmI(10))         // Int
    println(whoAmI("Hello"))    // String
    println(whoAmI(3.14))       // Double
    println(whoAmI(true))       // Boolean
}




