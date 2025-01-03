package decorator.starbuzz.additionals

import decorator.starbuzz.Beverage
import decorator.starbuzz.CondimentDecorator

class Soy(beverage: Beverage): CondimentDecorator() {

    init {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return beverage.getDescription() + ", Soy"
    }

    override fun cost(): Double {
        return beverage.cost() + .15
    }
}