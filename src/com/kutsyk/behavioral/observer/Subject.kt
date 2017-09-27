package com.kutsyk.behavioral.observer

abstract class Subject {
    private val observers = ArrayList<Observer>()

    abstract fun setState(state: String)
    abstract fun getState(): String

    fun attach(observer: Observer) = observers.add(observer)

    fun deattach(observer: Observer) = observers.remove(observer)

    fun notifyObservers() = observers.forEach { it -> it.update() }
}