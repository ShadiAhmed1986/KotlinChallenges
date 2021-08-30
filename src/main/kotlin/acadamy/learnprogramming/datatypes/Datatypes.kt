fun main() {

    //PRIMITIVE DATA TYPES

    val myInt = 10
    println("Default data type is ${myInt is Int}")
    var myLong = 22L

    //Auto-widening is not allowed in Kotlin !!!!
    myLong = myInt.toLong() // we use toLong()

    // we use toLong() for widening
    val myByte : Byte = 111
    var myShort : Short
    myShort = myByte.toShort()

    //double data type is also default
    var myDouble = 65.9876
    println("Default data type is ${myDouble is Double}")
    println(myDouble is Double)

    val myFloat = 834.235f
    println("This is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    //you can't assign numbers as char or ASCII values
//    val myChar : Char = 65

    val myCharInt = 65
    println(myCharInt.toChar())// to get the ASCII values of 65('A')

    val myBoolean = true


}