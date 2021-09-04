package acadamy.learnprogramming.lessons

fun main() {
    val lazerPrinter = LazerPrinter("Brother1234",15)
    lazerPrinter.printModel()
    println("Best selling price: "+lazerPrinter.bestSellingPrice())

    SomethingElse("whatever")
}


abstract class Printer(val modelName: String){
    open fun printModel() = println("The model name of this printer is ${modelName}")
    abstract fun bestSellingPrice(): Double
}

open class LazerPrinter(modelName: String, ppm: Int): Printer(modelName){
    final override fun printModel() = println("The model name of this lazer printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLazerPrinter(modelName: String,ppm: Int) : LazerPrinter(modelName, ppm ){

}

open class Something{
    val someProperty : String

    constructor(someParameter: String){
        someProperty = someParameter
        println("I am in the parent's constructor")
    }
}

class SomethingElse : Something{
    constructor(someOtherParameter : String) : super(someOtherParameter){
        println("I am in the child's constructor")
    }
}

