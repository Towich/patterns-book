package decorator.starbuzz.coffee

import decorator.starbuzz.Beverage

class Espresso : Beverage(){

    init {
        descript = "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }
}