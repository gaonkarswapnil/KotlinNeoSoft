package generics

class Container<T>(var data: T) {
    fun setValue(d: T) {
        data = d
    }

    fun getValue(): T {
        return data
    }
}

fun main() {
    val container = Container<Int>(3)
    println(container.getValue())

    val containerString = Container<String>("Hello")
    println(containerString.getValue())
}
