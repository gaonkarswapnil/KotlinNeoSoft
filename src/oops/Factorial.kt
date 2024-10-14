package oops

import java.math.BigInteger

class Factorial(val start: Int, val end: Int): Thread() {
    private var result: BigInteger = BigInteger.ONE
    override fun run() {
        for(i in start..end){
            result = result.multiply(BigInteger.valueOf(i.toLong()))
        }
    }

    fun getResult(): BigInteger{
        return result
    }
}

fun main(){
    val number: Int = 100
    val noOfThreads: Int = 5
    var start: Int=0
    var end: Int = 0
    var factarr: Array<Factorial?> = arrayOfNulls<Factorial>(noOfThreads)
    val range = number/noOfThreads

    for(i in 0 until noOfThreads){
        start = i*range+1;
        end = i*range+range
        factarr[i] = Factorial(start, end)
        factarr[i]?.start()
    }

    for (i in 0 until noOfThreads){
        try {
            factarr[i]?.join()
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
    var factResult:BigInteger = BigInteger.ONE;
    for(i in 0 until noOfThreads){
        factResult = factResult.multiply(factarr[i]?.getResult())
    }
    println(factResult)
}