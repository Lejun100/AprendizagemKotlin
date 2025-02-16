package Condicionais

fun main(args: Array<String>) {

    var idade = 1

    if(idade > 18) {
        println("Já ta crescido ")
    } else if(idade == 18) {
        println("Ta quase")
    } else {
        println("Receba")
    }

    var cor = "Azul"

    if (cor.length == 4) {
        println("SIm")
    } else {
        println("Receba")
    }

    var numero = 17

    when (numero % 2) {
        0 -> println("O número é par")
        1 -> println("O número é ímpar")
    }

    var letra = "z"

    when (letra) {
        "a", "e", "i", "o", "u" -> println("Vogal")
        else -> println("Consoante")
    }

    var overallJogador = 78
    var status = ""

    if (overallJogador >= 90) {
        status = "Jogador excelente"
    } else if (overallJogador >= 85 && overallJogador <= 89) {
        status = "Jogador bom"
    } else if (overallJogador >= 79 && overallJogador <= 84) {
        status = "Jogador razoavel"
    } else {
        status = "Receba"
    }

    println("O jogador de overall: $overallJogador é um $status")

}