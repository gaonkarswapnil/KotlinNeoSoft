package typesofclasses.DataClass

data class Event(val name: String, val date: String, var location: String = "Unknown")

fun main() {
    val event = Event("Event", "2020-08-08" )
    println(event)
}