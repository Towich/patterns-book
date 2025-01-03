package decorator.starbuzz

abstract class Beverage {
    protected var descript = "Unknown Beverage"

    open fun getDescription(): String = descript
    abstract fun cost(): Double
}