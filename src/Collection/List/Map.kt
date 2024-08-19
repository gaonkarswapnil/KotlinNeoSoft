package Collection.List

fun main() {
//    Immutable map
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)

//    Mutable Map
    val MutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println(MutableMap)

//    Iterate
    for((key, value) in map){
        println("$key -> $value")
    }

//    For-each
    map.forEach { it -> println(" ${it.key} -> ${it.value} ")}

//    Add element
    MutableMap[4] = "four"
    println(MutableMap)

//    remove
    MutableMap.remove(4)
    println(MutableMap)

//    Update
    MutableMap[3] = "Four"
    println(MutableMap)

//    contain
    println(map.containsKey(3))
    println(map.containsValue("four"))

//    Filter
    println(map.filter { it -> it.key>= 3 })

//    map
    println(map.map { (key, value) -> key*2 })

//    flatten
    val maps = mapOf("numbers" to listOf(1, 2, 3, 4), "letters" to listOf('a', 'b', 'c'))
    println(maps.values.flatten())
}