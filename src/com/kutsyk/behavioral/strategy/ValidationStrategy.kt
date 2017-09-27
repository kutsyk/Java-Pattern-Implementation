package com.kutsyk.behavioral.strategy

abstract class ValidationStrategy {
    public abstract fun isValid(creditCard: CreditCard): Boolean

    protected fun passesLuhn(ccNumber: String) = true

}