package com.kutsyk.behavioral.visitor

class Wheel: AtvPart {
    override fun accept(visitor: AtvPartVisitor) {
        visitor.visit(this)
    }
}