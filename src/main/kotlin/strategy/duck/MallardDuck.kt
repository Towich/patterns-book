package strategy.duck

import strategy.behavior.fly.FlyBehavior
import strategy.behavior.quack.QuackBehavior

class MallardDuck(
    override var flyBehavior: FlyBehavior,
    override var quackBehavior: QuackBehavior
) : Duck() {
    override fun display() {
        println("Mallard")
    }
}