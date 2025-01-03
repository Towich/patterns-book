package decorator.starbuzz.coffee

import decorator.starbuzz.Beverage

class DarkRoast : Beverage(){

    init {
        descript = "Dark Roast"
    }

    override fun cost(): Double {
        return .99
    }
}