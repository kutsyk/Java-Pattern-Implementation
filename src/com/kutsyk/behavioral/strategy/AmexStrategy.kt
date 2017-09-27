package com.kutsyk.behavioral.strategy

class AmexStrategy: ValidationStrategy() {

    override fun isValid(creditCard: CreditCard): Boolean {
        return true
    }

}