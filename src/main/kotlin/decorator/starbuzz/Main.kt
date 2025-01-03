package decorator.starbuzz

import decorator.starbuzz.additionals.Mocha
import decorator.starbuzz.additionals.Soy
import decorator.starbuzz.additionals.Whip
import decorator.starbuzz.coffee.DarkRoast
import decorator.starbuzz.coffee.Espresso
import decorator.starbuzz.coffee.HouseBlend

fun main() {
    val beverage: Beverage = Espresso()
    println(beverage.getDescription() + " $${beverage.cost()}")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2.getDescription() + " $${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println(beverage3.getDescription() + " $${beverage3.cost()}")


}