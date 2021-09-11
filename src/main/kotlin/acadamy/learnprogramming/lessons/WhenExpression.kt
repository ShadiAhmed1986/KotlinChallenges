package acadamy.learnprogramming.lessons

import java.math.BigDecimal

enum class Season{
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    var num = 100

    val timeOfYear = Season.SPRING
    val str = when(timeOfYear){
        Season.SPRING -> {
            num+=5
            "Flowers are blooming"
        }
        Season.SUMMER -> "It's hot"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> {
            num = 22 - 55
            "It's cold"
        }
    }
    println(str)

    val num2 = -50
    if(num < num2){
        println("num is less than num2")
    }
    else if(num > num2){
        println("num is greater than num2")
    }
    else{
        println("num = num2")
    }

    when{
        num < num2 -> println("num is less than num2")
        num > num2 -> println("num is greater than num2")
        else -> println("num = num2")
    }


    when(num){
        100, 600-> println("600")
        in 100..199-> println("In the range of 100..199")
        200-> println("200")
        300-> println("300")
        else-> println("Doesn't match anything")
    }

    val y = 10

    when(num){
        y + 80 -> println("90")
        y + 90 -> println("100")
        300-> println("300")
        else-> println("Doesn't match anything")
    }

    val obj: Any = "I am a String"
    val obj2: Any = BigDecimal(25.2)
    val obj3 : Any = 45

    val something : Any = obj2

//    if(something is String){
//        println(something.uppercase())
//    }
//    else if(something is BigDecimal){
//        println(something.remainder(BigDecimal(10.5)))
//    }
//    else if (something is Int){
//        println("${something - 22}")
//    }

    val z = when(something){
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println("${something - 22}")
        else -> println("I have no idea what type this is")
    }

    println(z)//kotlin.Unit
}