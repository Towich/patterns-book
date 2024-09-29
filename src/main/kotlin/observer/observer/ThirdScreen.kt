package observer.observer

class ThirdScreen : Observer {
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println("Third screen updated! pressure = $pressure")
    }
}