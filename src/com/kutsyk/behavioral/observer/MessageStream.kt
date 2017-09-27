package com.kutsyk.behavioral.observer

import java.util.*

class MessageStream: Subject() {

    private val messageHistory = ArrayDeque<String>()

    override fun setState(state: String) {
        messageHistory.add(state)
        this.notifyObservers()
    }

    override fun getState(): String = messageHistory.last

}