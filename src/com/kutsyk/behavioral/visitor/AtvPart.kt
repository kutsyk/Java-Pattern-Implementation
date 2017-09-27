package com.kutsyk.behavioral.visitor

interface AtvPart {
    public fun accept(visitor: AtvPartVisitor)
}