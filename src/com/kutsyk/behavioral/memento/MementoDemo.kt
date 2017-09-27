package com.kutsyk.behavioral.memento

fun main(args: Array<String>) {
    val careTacker = CareTacker()
    val emp = Employee("John Wick", "111 Main Street", "888-555-1212")

    println("Employee before save: $emp")

    careTacker.save(emp)

    emp.Phone = "444-555-6666"

    careTacker.save(emp)

    println("Employee after changed number save: $emp")

    emp.Phone = "333-999-6666"

    careTacker.revert(emp)

    println("Revert to last save point: $emp")

    careTacker.revert(emp)

    println("Revert to original: $emp")
}