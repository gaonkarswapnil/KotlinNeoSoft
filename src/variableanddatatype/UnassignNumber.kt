package variableanddatatype

fun main() {
    var numberByte: UByte = 3u;
    println("Unsigned Byte $numberByte")
    println("Min Byte ${UByte.MIN_VALUE}")
    println("Max Byte ${UByte.MAX_VALUE}")

    var numberShort: UShort = 3u;
    println("\nUnsigned Short ${numberShort::class.java.name}")
    println("Min Short ${UShort.MIN_VALUE}")
    println("Max Short ${UShort.MAX_VALUE}")

    var numberInt: UInt = 30u;
    println("\nUnsigned Int ${numberInt}")
    println("Min Int ${UInt.MIN_VALUE}")
    println("Max Int ${UInt.MAX_VALUE}")

    var numberLong: ULong = 3u;
    println("\nUnsigned Long ${numberLong::class.java}")
    println("Min Long ${ULong.MIN_VALUE}")
    println("Max Long ${ULong.MAX_VALUE}")

}