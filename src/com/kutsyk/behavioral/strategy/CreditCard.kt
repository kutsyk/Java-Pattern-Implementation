package com.kutsyk.behavioral.strategy

data class CreditCard(val number: String = "",
                      val date: String = "",
                      val cvv: String = "",
                      val strategy: ValidationStrategy)
{
    public fun isValid() = strategy.isValid(this)
}