package com.kutsyk.behavioral.visitor

class AtvPartShipingVisitor : AtvPartVisitor {

    var shippingAmouunt = 0

    override fun visit(wheel: Wheel) {
        shippingAmouunt += 15
        println("Wheel shiping amount is $shippingAmouunt")
    }

    override fun visit(fender: Fender) {
        shippingAmouunt += 3
        println("Fender shiping amount is $shippingAmouunt")
    }

    override fun visit(oil: Oil) {
        shippingAmouunt += 9
        println("Oil shiping amount is $shippingAmouunt")
    }

    override fun visit(partsOrder: PartsOrder) {
        shippingAmouunt += 5
        println("Shiping amount is $shippingAmouunt")
    }
}