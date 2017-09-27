package com.kutsyk.behavioral.observer

class PhoneClient(subject: Subject): Observer() {

    init {
        super.subject = subject
        this.subject?.attach(this)
    }

    fun addMessage(message: String) = subject?.setState("$message - sent from phone")

    override fun update() {
        println("Phone stream: ${subject?.getState()}")
    }
}