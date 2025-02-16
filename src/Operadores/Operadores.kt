package Operadores

fun main(args: Array<String>) {

    /*var a = 10
    var b = 20
    var c = a + b

    println(c)

    c = a % 3
    println(c)

    a += 100
    a -= 90
    a /= 10
    a *= 3
    a %= 4
    println(a)*/

    var age: Int? = null
    var myAge = age ?: 0    //0
    println(myAge)

    age = 25
    var newAge = age ?: 0
    println(newAge)

    println("\nClosed Range ..")
    var numbers = 1..10
    for (number in numbers) {
        println(number)   //Imprime de 1 a 10
    }

    println("\nHalf Closed Range (until)")
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        println(number)   //Imprime de 1 a 9
    }


}