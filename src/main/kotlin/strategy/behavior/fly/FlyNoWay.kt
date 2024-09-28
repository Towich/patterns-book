package strategy.behavior.fly

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("No flying!")
    }
}