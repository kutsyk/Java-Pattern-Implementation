package com.kutsyk.behavioral.memento

public class Employee(var Name: String, var Address: String, var Phone: String) {

    fun save(): EmployeeMemento = EmployeeMemento(Name, Phone)

    fun revert(emp: EmployeeMemento) {
        this.Name = emp.name
        this.Phone = emp.phone
    }

    override fun toString(): String {
        return "Employee(Name='$Name', Address='$Address', Phone='$Phone')"
    }


}