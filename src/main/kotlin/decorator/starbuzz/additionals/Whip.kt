package decorator.starbuzz.additionals

import decorator.starbuzz.Beverage
import decorator.starbuzz.CondimentDecorator

class Whip(beverage: Beverage): CondimentDecorator() {

    init {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return beverage.getDescription() + ", Whip"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}