package typesofclasses.Enum

// Enum are use to store constant values
interface CreditCardReturn{
    fun cashback(): Double;
}

enum class CreditCardType(val color: String): CreditCardReturn {
    SILVER(color = "grey"){
        override fun cashback(): Double{
            return 0.04;
        };
    },
    GOLD("gold"){
        override fun cashback(): Double{
            return 0.06;
        }
    },
    PLATINUM("silver"){
        override fun cashback(): Double{
            return 0.2
        }
    }
}

fun main() {
    println(CreditCardType.SILVER.color)



    when{
        CreditCardType.SILVER.color == "grey" -> println("Peters card is ${CreditCardType.SILVER}")
        CreditCardType.GOLD.color == "gold" -> println("Peters card is ${CreditCardType.GOLD}")
        CreditCardType.PLATINUM.color == "silver" -> println("Peters card is ${CreditCardType.PLATINUM}")
    }

    val arr = CreditCardType.values()
    arr.forEach { println(it) }

    println(CreditCardType.PLATINUM.cashback())
}
