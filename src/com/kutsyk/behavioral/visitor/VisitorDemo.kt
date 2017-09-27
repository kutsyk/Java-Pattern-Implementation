package com.kutsyk.behavioral.visitor

fun main(args: Array<String>) {
    val order = PartsOrder()
    order.addPart(Wheel())
    order.addPart(Fender())
    order.addPart(Oil())

    order.accept(AtvPartShipingVisitor())
}

