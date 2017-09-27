package com.kutsyk.behavioral.visitor

interface AtvPartVisitor {
    fun visit(wheel: Wheel)
    fun visit(fender: Fender)
    fun visit(oil: Oil)
    fun visit(partsOrder: PartsOrder)
}