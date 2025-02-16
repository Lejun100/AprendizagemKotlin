package Funcoes

fun main(args: Array<String>) {

    var a = 10
    var b = 20
    var c = 30

    somar(a, b, c)
    somar(2, 17, 3)

    salve()

    var x = subtrair(10,2, 3)
    println(x)

    var y = dividir(12, 4,2)
    println(y)
}

fun salve(){
    println("Receba")
}

fun somar(valor1: Int, valor2: Int, valor3: Int) {
    println("A soma é ${valor1 + valor2 + valor3}")
}

fun subtrair(valor1: Int, valor2: Int, valor3: Int): Int {
    var result = valor1 - valor2 - valor3
    return result
}

fun dividir(valor1: Int, valor2: Int, valor3: Int) = valor1 / valor2