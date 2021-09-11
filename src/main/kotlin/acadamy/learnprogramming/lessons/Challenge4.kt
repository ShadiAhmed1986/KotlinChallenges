package acadamy.learnprogramming.lessons

fun main() {
     //1.) 5, 10, 15, ....5000

//    for (i in 5..5000 step(5)){
//        println(i)
//    }

    //2.) -500 to 0
//    for (i in -500..0){
//        println(i)
//    }

    //3.)first 15 numbers in fibonacci
//    var total: Int
//    var secondToLast = 0
//    var last = 1
//
//    println(secondToLast)
//    println(last)
//    for (i in 1..13){
//        total = secondToLast + last
//        println(total)
//        secondToLast = last
//        last = total
//    }

    //4.) 1, 11, 100, 99, 98, 2
//    iloop@ for(i in 1..5){
//        println(i)
//        if (i==2){
//            break
//        }
//        for (j in 11..20){
//            println(j)
//            for (k in 100 downTo 90){
//                println(k)
//                if (k==98){
//                    continue@iloop
//                }
//            }
//        }
//    }

    //5.) Declare a variable called num(int) and assign it to whatever you want
    // and declare a variable called dnum (double) and assign it as follows:
    //if num > 100, assign dnum -234.567
    //if num < 100, assign dnum -444.555
    //if num == 100, assign dnum 0.0

    //do all of the above in one statement.expression
    //Then print the value of dnum - separate statement

    val num = 100
    val dnum = when{
        num < 100 -> -234.567
        num > 100 -> 444.555
        else-> 0.0
    }
    println(dnum)

}