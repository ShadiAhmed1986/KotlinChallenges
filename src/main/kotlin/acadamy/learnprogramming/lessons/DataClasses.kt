package acadamy.learnprogramming.lessons

fun main() {
    val car = Car("blue","Toyota",2015)
    println(car)//Car(color=blue, model=Toyota, year=2015)

    val car2 = Car("blue","Toyota",2015)
    println(car == car2)

    val car3 = car.copy()
    println(car3)//Car(color=blue, model=Toyota, year=2015)

    val car4 = car.copy(year = 2016)
    println(car4)//Car(color=blue, model=Toyota, year=2016)

}

data class Car(val color: String, val model: String, val year: Int){

}