package observer.subject

import observer.observer.Observer

interface Subject {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
}