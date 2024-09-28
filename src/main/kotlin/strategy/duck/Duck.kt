package strategy.duck

import strategy.behavior.fly.FlyBehavior
import strategy.behavior.quack.QuackBehavior

abstract class Duck {

    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("Swimming!")
    }
}