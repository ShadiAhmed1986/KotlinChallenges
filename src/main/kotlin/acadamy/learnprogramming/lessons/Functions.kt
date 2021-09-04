fun main() {

    println(labelMultiply(5,6,))//The answer is:  30

    val emp = Employeee("Jane")
    println(emp.upperCaseFirstName())//JANE

    val car1 = Car("blue","Toyota",2015)
    val car2 = Car("red","Ford",2016)
    val car3 = Car("grey","BMW",2017)

    printColors(car1,car2,car3,)

    val manyCars = arrayOf(car1,car2,car3)
    printColors(*manyCars)

    val moreCars = arrayOf(car2,car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars,*moreCars,car4)
    for (c in lotsOfCars){
        println(c)
    }

    val s = "this all is in lower case"
    println(s.upperFirstAndLast())
}

//Instead of using the method from Utils class ->
fun String.upperFirstAndLast() : String {
    val upperFirst = substring(0,1).uppercase() + substring(1)
    return upperFirst.substring(0,upperFirst.length-1) +
            upperFirst.substring(upperFirst.length-1, upperFirst.length).uppercase()
}

fun printColors(vararg cars: Car){
    for (car in cars){
        println(car.color)
    }
}

//USUAL WAY TO WRITE A FUNCTION

//fun labelMultiply(operand1: Int, operand2: Int, label: String) : String {
//    return ("$label ${operand1 * operand2}")
//}

//SHORT WAY TO WRITE A FUNCTION
fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The answer is: ") =
    "$label ${operand1 * operand2}"


class Employeee(val firstName: String){
    fun upperCaseFirstName() = firstName.uppercase()
}

data class Car(val color: String, val model: String, val year: Int){

}