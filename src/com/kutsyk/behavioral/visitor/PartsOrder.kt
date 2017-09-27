package com.kutsyk.behavioral.visitor

class PartsOrder: AtvPart {

    val parts = ArrayList<AtvPart>()

    fun addPart(atvPart: AtvPart) = parts.add(atvPart)

    override fun accept(visitor: AtvPartVisitor) {
        parts.forEach{it.accept(visitor)}
        visitor.visit(this)
    }

}