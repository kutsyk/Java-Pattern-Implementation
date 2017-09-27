package com.kutsyk.behavioral.visitor

class Oil : AtvPart {
    override fun accept(visitor: AtvPartVisitor) {
        visitor.visit(this)
    }
}