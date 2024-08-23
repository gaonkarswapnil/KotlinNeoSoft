package typesofclasses.Enum

enum class Day {
    Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;

    fun isWeekend(): Boolean = this == Saturday || this == Sunday
}

fun main() {
    for(day in Day.values()) {
        println("${day.name} is ${if(day.isWeekend()) "Weekend" else "Weekday"}")
    }
}