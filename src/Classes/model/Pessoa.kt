package Classes.model

import java.time.LocalDate
import java.time.Period

open class Pessoa {

    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(1970, 1, 1)
    var peso: Int = 0
    var altura: Double = 0.0

    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }

    open fun exibirDados(){
        println("Nome: $nome")
        println("Data nascimento: $dataNascimento")
        println("Alturas: $altura")
        println("Peso: $peso")
        println("Idade: ${calcularIdade()}")
    }

    fun calcularIdade(): Int{
        var idade = Period.between(dataNascimento, LocalDate.now()).years
        return idade.inc()
    }

}