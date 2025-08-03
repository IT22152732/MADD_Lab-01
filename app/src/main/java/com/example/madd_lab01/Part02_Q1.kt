package com.example.madd_lab_01

abstract class Employee(val name: String, val id: Int) {
    abstract fun work()
}

class TemporaryStaff(name: String, id: Int, val contractPeriod: Int): Employee(name, id) {
    override fun work() {
        println("$name (Temp) is working for $contractPeriod months.")
    }
}

class PermanentStaff(name: String, id: Int, val department: String): Employee(name, id) {
    override fun work() {
        println("$name (Permanent) works in $department department.")
    }
}

fun main() {
    val temp = TemporaryStaff("Kamal", 1001, 6)
    val perm = PermanentStaff("Nadeesha", 1002, "IT")

    temp.work()
    perm.work()
}
