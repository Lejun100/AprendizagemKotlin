package Lacos

fun main (args: Array<String>) {

    var numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var i = 0

    /*while (i < numeros.size) {
        if (numeros[i] % 2 == 0) {
            println("${numeros[i]} é par")
        }
        i ++
    }*/

//    for (i in 0 until numeros.size - 1) {
//        if ( numeros[i] % 2 != 0 ) {
//            println("${numeros[i]} é ímpar")
//        }
//    }

    var frutas = listOf("Aba", "Uva", "Mora")

    for (fruta in frutas) {
        println(fruta)
    }

    while (i <= frutas.size){
        println(frutas[i])
        i++
    }
}