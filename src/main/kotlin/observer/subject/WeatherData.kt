package observer.subject

import observer.observer.Observer

class WeatherData : Subject {

    private val observers: MutableSet<Observer> = mutableSetOf()

    var temperature: Float = 0f
        set(value) {
            field = value
            measurementsChanged()
        }
    var humidity: Float = 0f
        set(value) {
            field = value
            measurementsChanged()
        }
    var pressure: Float = 0f
        set(value) {
            field = value
            measurementsChanged()
        }

    // Здесь возникает проблема - не всем подписчикам интересны все три датчика
    // например, SecondScreen использует только датчик temperature
    // но в данной реализации он получит обновление, даже если сам temperature не изменился
    // выход из этой ситуации: декомпозиция Observer'а
    //
    // также можно вынести этот метод в интерфейс
    private fun measurementsChanged() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }
}