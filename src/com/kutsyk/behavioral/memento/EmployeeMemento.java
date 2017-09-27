package com.kutsyk.behavioral.memento;

public class EmployeeMemento {

    public String name;
    public String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
