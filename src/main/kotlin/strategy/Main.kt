package strategy

import strategy.behavior.fly.FlyNoWay
import strategy.behavior.fly.FlyWithWings
import strategy.behavior.quack.MuteQuack
import strategy.behavior.quack.Quack
import strategy.behavior.quack.Squeak
import strategy.duck.MallardDuck
import strategy.duck.RubberDuck

fun main() {
    val mallardDuck = MallardDuck(FlyWithWings(), Quack())
    mallardDuck.display()
    mallardDuck.swim()
    mallardDuck.performFly()
    mallardDuck.performQuack()

    mallardDuck.quackBehavior = Squeak()
    mallardDuck.performQuack()

    println("------------")

    val rubberDuck = RubberDuck(FlyNoWay(), MuteQuack())
    rubberDuck.display()
    rubberDuck.swim()
    rubberDuck.performFly()
    rubberDuck.performQuack()
}