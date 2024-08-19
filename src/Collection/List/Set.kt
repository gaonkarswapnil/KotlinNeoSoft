package Collection.List

fun main() {
//    Immutable List = read only. cannot add, remove modify once created
    var set = setOf(1,2,4,1,2,3,4,5)
    println(set)
//    set.add(31)               //      --> not allowed

//    Mutable Set = can read, add, modify, remove later once created
    var mutableSet = mutableSetOf(1,2,1,2,3,4,4,5,3);
    println(mutableSet)

//    Iterate Over set
    for(set in mutableSet){
        println(set)
    }

//    for-Each
    set.forEach { it -> println(it) }

//    add element
    mutableSet.add(12)

//    remove element
    mutableSet.remove(12)
    println(mutableSet)

    val fruits = setOf("Apple", "Banana", "Orange", "Pear")
    println(fruits.contains("Apple"))

//    filter
    println(fruits.filter { it -> it.startsWith("A") })

//    Map
    println(fruits.map { it -> it + it })

//    groupBy
    println(fruits.groupBy { it -> it.last() })

    var set1 = setOf(1,2,3)
    var set2 = setOf(3,4,5)

//    Union: will combine all the elements and return the output
    println(set1.union(set2))

//    Intersection: will return common of both the set
    println(set1.intersect(set2))

//    subtract: Will return all the none matching elements of the set
    println(set1.subtract(set2))

//    isEmpty, isNotEmpty: check if the set is empty or not
    println(set1.isEmpty())
    println(set1.isNotEmpty())


//    FLatten
    var sets = setOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    println(sets.flatten())

//    Zip
    var number = setOf(1,2,3,4,5)
    var words = setOf("Abc", "Def","Ghi")
    println(number.zip(words))

//    Partitions
    var series = setOf(1,2,3,4,5,6,7,8,9)
    var (even, odd) = series.partition { it % 2 == 0 }
    println(even)
}