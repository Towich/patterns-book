package decorator.starbuzz.coffee

import decorator.starbuzz.Beverage

class HouseBlend : Beverage(){

    init {
        descript = "House Blend Coffee"
    }

    override fun cost(): Double {
        return .89
    }
}