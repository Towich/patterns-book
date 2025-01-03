package decorator.starbuzz

abstract class CondimentDecorator: Beverage() {
    lateinit var beverage: Beverage

    abstract override fun getDescription(): String
}