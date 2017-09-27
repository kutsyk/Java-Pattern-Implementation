package com.kutsyk.behavioral.observer

fun main(args: Array<String>) {
    val subject = MessageStream()

    val phoneClient = PhoneClient(subject)
    val tabletClient = TabletClient(subject)

    phoneClient.addMessage("Here is a new message!")
    tabletClient.addMessage("Here is a new message!")
}