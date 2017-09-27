package com.kutsyk.behavioral.observer

abstract class Observer {
    protected var subject: Subject? = null
    abstract fun update()
}
