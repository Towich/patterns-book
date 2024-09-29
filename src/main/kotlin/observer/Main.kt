package observer

import observer.observer.FirstScreen
import observer.observer.SecondScreen
import observer.observer.ThirdScreen
import observer.subject.WeatherData

fun main() {
    val weatherData = WeatherData()

    val firstScreen = FirstScreen()
    val secondScreen = SecondScreen()
    val thirdScreen = ThirdScreen()

    weatherData.addObserver(firstScreen)
    weatherData.addObserver(secondScreen)
    weatherData.addObserver(thirdScreen)

    weatherData.temperature = 451f

    weatherData.removeObserver(firstScreen)
    weatherData.removeObserver(secondScreen)
    weatherData.temperature = 450f
    weatherData.humidity = 99f
    weatherData.pressure = 80f
}