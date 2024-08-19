package Collection.List

fun main(){
    val list = mutableListOf(1,2,3,4,5)
    println(list)

    list.add(10)         //     --->    Add elements to list

    list[1] = 20        //      --->    Changing the element according to index position

    println(list)

    val firstElement = list[0]      // ---> It use to access first element
    println(firstElement)

//    For LOOP
    for(element in list){
        println(element)
    }

//    FOR-EACH
    list.forEach { it -> println(it) }

//    Add full list or multiple element in list
    list.addAll(mutableListOf(11,12,13,14,15))

//    Remove element
    list.remove(10)

//    Remove last element
    list.removeLast();

//    Remove all will remove multiple elements
    list.removeAll(listOf(1,2,3,4))

    println(list)



    var list1 = listOf(1,2,3,4,5)
    var list2 = listOf("a","b","c")

//    Zip: it helps to pair elements of two lists
//    Such as 1st element of first list pair with 1st element of second list
//    if first list have 5 element and second list have 3 element the output will be of 3 pair
    var map = list1.zip(list2)
    println(map)


//    MultiDimensional List
    var lists = listOf(
        listOf(1,2,3),
        listOf(4,5,6),
        listOf(7,8,9, 10, 11)
    )

//    Flatten: It helps to convert multidimensional list into single Dimension
    println(lists.flatten())


    var numbers = listOf(1,2,3,4,5)
//    Partition: It helps to divide list into two parts according to the condition specified
//    in the below example when the condition is true the value is assign to the left variable
//    and if its false its assign to right variable
    var (even, odd) = numbers.partition { it > 3 }
    println(even)
    println(odd)

//    groupBy: It will separate the list and form a group of arrange all elements
    var words = listOf("Alice", "Bob", "Alice")
    println(words.groupBy { it ->  it.first() })


//    filter: if helps to filter data according to condition
    println(numbers.filter { it -> it%2==0 })

//    Mapping:
    println(numbers.map { it -> it*it })

//    Sorting: Sort elements of the list
    println(numbers.sorted())

//    Reverse: reverse the list
    println(numbers.reversed())

//    Find: It helps to find elements from the list
    println(words.find { it -> it.endsWith("e") })

//    contain: It will check if the item is present in list or not
//    It will return boolean expression
    println(words.contains("alice"))

    println(words.map { it -> it.lowercase() }.contains("bob"))
}
