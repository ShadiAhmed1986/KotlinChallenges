package acadamy.learnprogramming.lessons

fun main() {
    val seasons = arrayOf("spring","summer","winter","fall")

//    for (index in seasons.indices){
//        println("${seasons[index]} is season number $index")
//    }
//
//    seasons.forEach { println(it) }
//    seasons.forEachIndexed{index, value -> println("$value is season number $index") }
//
//    val notASeason = "whatever" !in seasons
//    println(notASeason)
//
//    val notInRange = 32 !in 1..10
//    println(notInRange)
//
//    val str = "Hello"
//    println("e" in str)
//    println("e" !in str)

    //NESTED LOOP
    for (i in 1..3){
        println("i = $i")
        jloop@ for (j in 1..4){
            println("j = $j")
            for (k in 5..10){
                println("k = $k")
                if(k == 7){
                    break@jloop;
                }
            }
        }

    }
}