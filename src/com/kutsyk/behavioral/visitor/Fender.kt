package com.kutsyk.behavioral.visitor

class Fender : AtvPart {
    override fun accept(visitor: AtvPartVisitor) {
        visitor.visit(this)
    }
}