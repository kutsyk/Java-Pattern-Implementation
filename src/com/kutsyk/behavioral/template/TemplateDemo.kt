package com.kutsyk.behavioral.template

// every child of order will have own implementation of procces
// but process proceed by the same algorithm
fun main(args: Array<String>) {
    val order = GiftOrder()
    order.buy()
}