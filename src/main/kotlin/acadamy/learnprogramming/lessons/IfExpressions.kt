package acadamy.learnprogramming.lessons

fun main() {
    var someCondition = 69 < 22

    //val num = if(someCondition) 50 else 453

    val num2 = if (someCondition){
        println("Something")
        50
    }
    else{
        println("something else")
        453
    }

    println(num2)

}