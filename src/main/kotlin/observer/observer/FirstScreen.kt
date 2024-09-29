package observer.observer

class FirstScreen : Observer {
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println(
            "First screen updated! " +
                    "temperature = $temperature, " +
                    "humidity = $humidity, " +
                    "pressure = $pressure"
        )
    }
}