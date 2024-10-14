package Collection.Practice

// Define a data class with 6 properties
data class Person(
    val id: Int,
    val name: String,
    val age: Int,
    val email: String,
    val city: String,
    val occupation: String
)

// Initialize a list of Person objects
val people: List<Person> = listOf(
    Person(1, "Alice", 28, "alice@example.com", "New York", "Engineer"),
    Person(2, "Bob", 35, "bob@example.com", "Los Angeles", "Doctor"),
    Person(3, "Charlie", 22, "charlie@example.com", "Chicago", "Designer"),
    Person(4, "Diana", 30, "diana@example.com", "Houston", "Teacher"),
    Person(5, "Eve", 26, "eve@example.com", "San Francisco", "Developer"),
    Person(6, "Frank", 40, "frank@example.com", "Miami", "Architect"),
    Person(7, "Grace", 33, "grace@example.com", "Seattle", "Nurse"),
    Person(8, "Hank", 29, "hank@example.com", "Dallas", "Lawyer"),
    Person(9, "Ivy", 25, "ivy@example.com", "Austin", "Musician"),
    Person(10, "Jack", 37, "jack@example.com", "Boston", "Chef"),
    Person(11, "Kim", 31, "kim@example.com", "San Diego", "Artist"),
    Person(12, "Leo", 23, "leo@example.com", "Phoenix", "Photographer"),
    Person(13, "Mia", 34, "mia@example.com", "Denver", "Writer"),
    Person(14, "Nina", 27, "nina@example.com", "Portland", "Scientist"),
    Person(15, "Oscar", 45, "oscar@example.com", "Philadelphia", "Engineer")
)

//How can you filter the list to get all the people who live in "New York"?
fun personLivingInSpecificCity(personData: List<Person>){
    personData.filter { it.city == "New York" }.forEach { println(it) }
}

//How would you get a list of all the people whose age is greater than 25?
fun ageGreaterThan(personData: List<Person>){
    personData.filter { it.age > 25 }.forEach { println(it) }
}

//How can you create a list of just the names of all the people in the collection?
fun names(personData: List<Person>){
    personData.map { it.name }.forEach { println(it) }
}

//How can you map the list to create a new list of Pair<String, String> where each pair contains the person's name and city?
fun pairOfNameCity(personData: List<Person>){
    personData.map { it.name to it.city }.forEach { println(it) }
}


//How would you sort the list by the age of the people in ascending order?
fun sortByAge(personData: List<Person>){
    personData.sortedBy { it.age }.forEach { println(it) }
}

//How would you sort the list first by city, then by name in alphabetical order?
fun sortByCityAndName(personData: List<Person>){
    personData.sortedBy { it.city }.also { it.sortedBy { it.name } }.forEach { println(it) }
}

//How would you calculate the total sum of all the ages of the people in the collection?
fun totalSumOfAges(personData: List<Person>){
    personData.fold(0){ prev, next -> prev+next.age }
}

//How would you concatenate all the names into a single string, separated by commas?
fun namesInSingle(personData: List<Person>){
    println(personData.map { it.name }.reduce { pre, next -> "$pre,$next" })
}

//How would you group the people by their occupation and create a map where the key is the occupation and the value is the list of people in that occupation?
fun groupPeopleByOccapution(personData: List<Person>){
    personData.groupBy { it.occupation }.forEach{ println("$") }
}


//How would you get a list of all the unique cities where the people live?
fun uniqueCities(personData: List<Person>){
    personData.distinctBy { it.city }.forEach { println(it) }
}

//How can you get a list of distinct occupations from the collection?
fun uniqueOccupation(personData: List<Person>){
    personData.distinctBy { it.occupation }.forEach { println(it) }
}

//How would you check if there is any person in the collection who is older than 40?
fun olderThan(personData: List<Person>){
    println(personData.any { it.age > 40 })
}

//How would you check if all people in the collection are from "New York"?
fun allPeopleInNewYork(personData: List<Person>){
    println(personData.all { it.city == "New York" })
}

//How would you check if none of the people are developers?
fun noneDeveloper(personData: List<Person>){
    println(personData.none{it.occupation == "Developer"})
}

//How would you partition the list into two lists: one with people under 30 and one with people 30 and older?
fun partitionList(personData: List<Person>){
    var(under30, above30) = personData.partition { it.age < 30 }
    println("Under 30")
    under30.forEach { println(it) }

    println("30 and Above")
    above30.forEach { println(it) }
}

//How would you find the first person whose name starts with "A"?
fun findFirstNameStart(personData: List<Person>){
    println(personData.find { it.name.startsWith("A") })
}

//How would you find the last person who lives in "San Francisco"?
fun findLastPerson(personData: List<Person>){
    println(personData.findLast { it.city == "San Francisco" })
}

fun main() {
//    personLivingInSpecificCity(people)
//    ageGreaterThan(people)
//    names(people)
//    pairOfNameCity(people)
//    sortByAge(people)
//    sortByCityAndName(people)
//    namesInSingle(people)
//    groupPeopleByOccapution(people)
//    uniqueCities(people)
//    uniqueOccupation(people)
//    olderThan(people)
//    allPeopleInNewYork(people)
//    noneDeveloper(people)
//    partitionList(people)
    findFirstNameStart(people)
//    findLastPerson(people)
}
