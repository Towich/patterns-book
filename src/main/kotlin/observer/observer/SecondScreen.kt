package observer.observer

class SecondScreen : Observer {
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println("Second screen updated! temperature = $temperature")
    }
}