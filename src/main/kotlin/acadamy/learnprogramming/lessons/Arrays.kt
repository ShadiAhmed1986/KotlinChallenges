import acadamy.learnprogramming.javacode.DummyClass

fun main() {

    val names = arrayOf("John","Jane","Joe")

    val longs1 = arrayOf(1L,2L,23L)

    val longs2 = arrayOf<Long>(1,2,3,4)

    val longs3 = arrayOf(1,2,3,4)

    println(longs2 is Array<Long>)//true
    println(longs3 is Array<Int>)//true
    println(longs1 is Array<Long>)//true

    println(longs1[2])

    val evenNumbers = Array(16){i -> i * 2}

    for (number in evenNumbers){
        println(number)//gives all array numbers from 0 to 16 multiplied by 2
    }

    val lotsOfNumbers = Array(10000){i -> i + 1}
    //println(lotsOfNumbers)//that will print all numbers from 1 to 10000

    val allZero = Array(1000){ 0 } // all numbers are 0

    var someArray : Array<Int>

    someArray = arrayOf(1,2,3,4)
    for(number in someArray){
        println(number)
    }

    someArray = Array(6){ i -> (i+1) * 10}
    for(number in someArray){
        println(number)
    }

    val mixedArray = arrayOf("hello",22,'a')
    for (element in mixedArray){
        println(element)
    }

    println(mixedArray is Array<*>)

    //to work pass the kotlin array to a java method we should use 'intArrayOf()' for kotlin array
    val myIntArray = intArrayOf(3,5,7,8,9,3,2)
    DummyClass().printNumbers(myIntArray)

    //convert it
    DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray = myIntArray.toTypedArray()
}