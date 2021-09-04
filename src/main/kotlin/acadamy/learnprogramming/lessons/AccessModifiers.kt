import java.awt.Color

val MY_CONSTANT = 100


fun main() {

    println(MY_CONSTANT)

    val emp = Employee("John")
    println(emp.firstName)
    println(emp.fullTime)

    val emp2 = Employee("Joe",)
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane",false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
}


//This is a constructor
class Employee (val firstName: String, fullTime: Boolean = true){

    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }

    set(value) {
        println("Running the custom set")
        field = value
    }
}

class Demo{
    val dummy : String

    constructor(){
        dummy = "Hello"
    }
}