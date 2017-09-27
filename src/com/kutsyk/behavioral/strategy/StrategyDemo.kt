package com.kutsyk.behavioral.strategy

fun main(args: Array<String>) {
    val creditCard = CreditCard("123456789123456789", "123", "123", AmexStrategy())
    creditCard.isValid()
}