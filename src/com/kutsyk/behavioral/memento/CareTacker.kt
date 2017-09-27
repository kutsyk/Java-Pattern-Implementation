package com.kutsyk.behavioral.memento

import java.util.*

class CareTacker {

    private val employeeHistory = Stack<EmployeeMemento>()

    fun save(emp: Employee) = employeeHistory.push(emp.save())

    fun revert(emp: Employee) = emp.revert(employeeHistory.pop())

}