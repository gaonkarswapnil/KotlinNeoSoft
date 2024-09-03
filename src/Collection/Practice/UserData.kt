package Collection.Practice

fun main(){
    val userData = mutableListOf(
        User(1, "john.doe", "john.doe@example.com", "Engineering", 75000, "2020-01-15"),
        User(2, "jane.smith", "jane.smith@example.com", "Marketing", 68000, "2019-03-22"),
        User(3, "bob.johnson", "bob.johnson@example.com", "HR", 72000, "2021-07-19"),
        User(4, "alice.williams", "alice.williams@example.com", "Finance", 83000, "2018-11-10"),
        User(5, "charlie.brown", "charlie.brown@example.com", "Sales", 69000, "2022-05-30"),
        User(6, "emily.davis", "emily.davis@example.com", "IT", 71000, "2017-08-03"),
        User(7, "daniel.miller", "daniel.miller@example.com", "Legal", 80000, "2016-09-25"),
        User(8, "olivia.jones", "olivia.jones@example.com", "Design", 67000, "2021-12-01"),
        User(9, "william.garcia", "william.garcia@example.com", "Engineering", 74000, "2022-02-14"),
        User(10, "ava.martinez", "ava.martinez@example.com", "Marketing", 66000, "2019-10-07"),
        User(11, "michael.rodriguez", "michael.rodriguez@example.com", "Sales", 71000, "2020-06-12"),
        User(12, "sofia.taylor", "sofia.taylor@example.com", "HR", 73000, "2021-04-08"),
        User(13, "liam.moore", "liam.moore@example.com", "Finance", 85000, "2018-01-20"),
        User(14, "isabella.anderson", "isabella.anderson@example.com", "Design", 68000, "2020-03-15"),
        User(15, "james.thomas", "james.thomas@example.com", "Legal", 79000, "2017-05-21"),
        User(16, "charlotte.jackson", "charlotte.jackson@example.com", "IT", 72000, "2019-11-30"),
        User(17, "benjamin.white", "benjamin.white@example.com", "Engineering", 76000, "2021-09-04"),
        User(18, "amelia.harris", "amelia.harris@example.com", "Marketing", 67000, "2022-01-12"),
        User(19, "elijah.martin", "elijah.martin@example.com", "HR", 75000, "2018-06-17"),
        User(20, "harper.thompson", "harper.thompson@example.com", "Finance", 83000, "2022-07-22"),
        User(21, "george.garcia", "george.garcia@example.com", "Sales", 69000, "2020-10-29"),
        User(22, "evelyn.young", "evelyn.young@example.com", "Design", 66000, "2019-12-11"),
        User(23, "henry.martinez", "henry.martinez@example.com", "Engineering", 75000, "2021-11-23"),
        User(24, "ella.walker", "ella.walker@example.com", "Marketing", 67000, "2019-04-01"),
        User(25, "sebastian.lee", "sebastian.lee@example.com", "Legal", 81000, "2016-12-05"),
        User(26, "scarlett.hall", "scarlett.hall@example.com", "IT", 70000, "2021-03-19"),
        User(27, "alexander.king", "alexander.king@example.com", "HR", 74000, "2017-07-24"),
        User(28, "grace.green", "grace.green@example.com", "Finance", 86000, "2020-09-10"),
        User(29, "liam.carter", "liam.carter@example.com", "Sales", 72000, "2022-06-30"),
        User(30, "zara.james", "zara.james@example.com", "Design", 67000, "2021-08-16"),
        User(31, "ethan.wright", "ethan.wright@example.com", "Engineering", 77000, "2020-04-14"),
        User(32, "mia.baker", "mia.baker@example.com", "Marketing", 68000, "2018-02-25"),
        User(33, "owen.morris", "owen.morris@example.com", "HR", 73000, "2017-09-13"),
        User(34, "ella.cox", "ella.cox@example.com", "Finance", 85000, "2019-12-31"),
        User(35, "william.ward", "william.ward@example.com", "Sales", 71000, "2021-01-18"),
        User(36, "ariana.martin", "ariana.martin@example.com", "Design", 69000, "2022-03-09"),
        User(37, "jacob.nelson", "jacob.nelson@example.com", "Legal", 80000, "2018-07-12"),
        User(38, "lily.rodgers", "lily.rodgers@example.com", "IT", 73000, "2017-10-24"),
        User(39, "jackson.clark", "jackson.clark@example.com", "Engineering", 74000, "2020-05-16"),
        User(40, "natalie.morris", "natalie.morris@example.com", "Marketing", 67000, "2021-11-29"),
        User(41, "logan.brown", "logan.brown@example.com", "HR", 72000, "2020-09-18"),
        User(42, "emily.lee", "emily.lee@example.com", "Finance", 86000, "2019-05-04"),
        User(43, "isaac.taylor", "isaac.taylor@example.com", "Sales", 70000, "2022-02-01"),
        User(44, "stella.perez", "stella.perez@example.com", "Design", 68000, "2018-11-12"),
        User(45, "leo.davis", "leo.davis@example.com", "Legal", 79000, "2017-12-19"),
        User(46, "audrey.harris", "audrey.harris@example.com", "IT", 71000, "2021-05-22"),
        User(47, "jackson.king", "jackson.king@example.com", "Engineering", 75000, "2018-04-26"),
        User(48, "zoe.miller", "zoe.miller@example.com", "Marketing", 66000, "2019-11-12"),
        User(49, "henry.martin", "henry.martin@example.com", "HR", 74000, "2017-12-21"),
        User(50, "ava.morris", "ava.morris@example.com", "Finance", 83000, "2019-11-17"),
        User(51, "nathan.johnson", "nathan.johnson@example.com", "Sales", 68000, "2021-08-23"),
        User(52, "laura.adams", "laura.adams@example.com", "Design", 67000, "2018-01-07"),
        User(53, "grayson.rogers", "grayson.rogers@example.com", "Legal", 80000, "2016-10-05"),
        User(54, "harper.wood", "harper.wood@example.com", "IT", 72000, "2022-04-11"),
        User(55, "liam.carter", "liam.carter@example.com", "Engineering", 74000, "2019-06-22"),
        User(56, "ava.smith", "ava.smith@example.com", "Marketing", 68000, "2021-10-03"),
        User(57, "ethan.kim", "ethan.kim@example.com", "HR", 73000, "2022-07-01"),
        User(58, "scarlett.harris", "scarlett.harris@example.com", "Finance", 86000, "2018-02-12"),
        User(59, "matthew.james", "matthew.james@example.com", "Sales", 70000, "2021-05-27"),
        User(60, "grace.lee", "grace.lee@example.com", "Design", 69000, "2020-12-15"),
        User(61, "aaron.young", "aaron.young@example.com", "Legal", 79000, "2017-11-10"),
        User(62, "ella.nelson", "ella.nelson@example.com", "IT", 70000, "2019-04-25"),
        User(63, "liam.martin", "liam.martin@example.com", "Engineering", 75000, "2019-04-10"),
        User(64, "zoe.morris", "zoe.morris@example.com", "Marketing", 66000, "2018-11-05"),
        User(65, "emily.james", "emily.james@example.com", "HR", 74000, "2017-11-22"),
        User(66, "ava.green", "ava.green@example.com", "Finance", 85000, "2021-07-17"),
        User(67, "jacob.smith", "jacob.smith@example.com", "Sales", 68000, "2022-03-08"),
        User(68, "scarlett.white", "scarlett.white@example.com", "Design", 67000, "2018-05-12"),
        User(69, "liam.jones", "liam.jones@example.com", "Legal", 80000, "2016-10-22"),
        User(70, "grace.wood", "grace.wood@example.com", "IT", 73000, "2018-03-11"),
        User(71, "james.adams", "james.adams@example.com", "Engineering", 74000, "2021-09-03"),
        User(72, "mia.lee", "mia.lee@example.com", "Marketing", 68000, "2019-05-30"),
        User(73, "ethan.green", "ethan.green@example.com", "HR", 73000, "2017-06-14"),
        User(74, "natalie.rodriguez", "natalie.rodriguez@example.com", "Finance", 86000, "2020-07-12"),
        User(75, "jack.morris", "jack.morris@example.com", "Sales", 70000, "2021-12-05"),
        User(76, "zoe.brown", "zoe.brown@example.com", "Design", 68000, "2018-08-22"),
        User(77, "grayson.carter", "grayson.carter@example.com", "Legal", 79000, "2017-02-27"),
        User(78, "harper.martin", "harper.martin@example.com", "IT", 71000, "2021-06-11"),
        User(79, "liam.rogers", "liam.rogers@example.com", "Engineering", 76000, "2018-09-15"),
        User(80, "emily.green", "emily.green@example.com", "Marketing", 67000, "2022-01-21"),
        User(81, "ava.harris", "ava.harris@example.com", "HR", 74000, "2019-11-13"),
        User(82, "jacob.davis", "jacob.davis@example.com", "Finance", 85000, "2020-10-28"),
        User(83, "ella.martinez", "ella.martinez@example.com", "Sales", 71000, "2021-11-19"),
        User(84, "liam.lee", "liam.lee@example.com", "Design", 67000, "2019-03-04")
    )

//    userData.filter {
//        it.department == "Engineering" && it.salary>75000
//    }.forEach{ println(it) }
//
//    userData.filter {
//        it.joiningDate > "2022-01-01"
//    }.forEach{ println(it) }

//    userData.sortByDescending {
//        it.joiningDate
//    }

//    userData.sortWith(compareBy <User>{ it.joiningDate }.thenByDescending { it.salary })
//    userData.forEach{
//        println(it)
//    }

//    userData.groupBy { it.department }.forEach { println("${it.key}  ${it.value.size}") }

//    userData.groupBy { it.department }.forEach{ println("${it.key} ${it.value.sumOf { it.salary }}") }

//    userData.groupBy { it.department }.forEach{
//        (department, salary) ->
//        val average = salary.sumOf { it.salary }/ salary.size
//        println("${department} ${average}")
//    }

//    userData.groupBy { it.department }.forEach { t, u ->
//        val max = u.maxBy { it.salary }
//        println("${t} ${max.salary}")
//    }

//    userData.groupBy { it.department }.forEach{ t,u ->
//        val min = u.minBy { it.salary }
//        println("${t} ${min.salary}")
//    }

//    userData.map { it ->
//        val inc = it.salary*0.05
//        it.salary+inc
//    }.forEach{
//        println(it)
//    }

    userData.map{
        mapOf("Username" to it.username, "Email" to it.email)
    }.forEach{ println(it) }
}