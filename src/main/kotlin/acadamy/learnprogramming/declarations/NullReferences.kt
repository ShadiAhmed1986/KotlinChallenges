fun main() {
    //to make a variable nullable user '?'
    val str : String? = null
    //you cant use methods for null variables

    //1.Way
    if(str != null){
        str.uppercase()
    }

    //2.Way
    str?.uppercase()

    println("What happens when we do this: ${str?.uppercase()}")

    //When we use it with if-else statement we can use it without '?'
    if (str == null){
        null
    }
    else{
        str.uppercase()
    }

    //Elvis OPERATOR

    //If str is null the str2 will be assigned a default value
    val str2 = str ?: "This is the default value"
    println(str2)//This is the default value

//    val something : Any = arrayOf(1,2,3,4)
//    val str3 = something as String
//    println(str3)//java.lang.ClassCastException

    //NOT NULL ASSERTION -> WHEN YOU KNOW ITS NOT NULL 100%
    val str4: String = "This is a String"
    val str5 = str4!!.uppercase()//we will get an exception if str4 is null


    val str6: String? = "This is not null"
//    if (str6 != null){
//        printText(str6)
//    }
    str6?.let { printText(it) }
    val str7 = str6!!
    val str8 = str7.uppercase()

    ///////////////////////////////

    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts){
        println(i)
    }
}

fun printText(text: String){
    println(text)
}