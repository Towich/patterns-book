package strategy.behavior.quack

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("~ Silence ~")
    }
}