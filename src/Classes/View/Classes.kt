package Classes.View

import Classes.model.Funcionario
import Classes.model.Pessoa
import java.time.LocalDate

fun main(args: Array<String>) {

    val pessoa = Pessoa()
    pessoa.nome = "Jun"
    pessoa.peso = 98
    pessoa.altura = 1.12
    pessoa.dataNascimento = LocalDate.of(1970, 1, 1)

    println(pessoa.nome)

    val pessoa2 = Pessoa()
    pessoa2.nome = "Jun"
    pessoa2.peso = 98
    pessoa2.dataNascimento = LocalDate.of(1970, 1, 1)
    pessoa2.altura = 1.12

    println(pessoa2.nome)
    println(pessoa2.dataNascimento)
    println(pessoa2.peso.toString())

    pessoa2.peso = 78

    println(pessoa2.peso.toString())

    pessoa.exibirDados()
    pessoa.exibirDados()

    println(pessoa.idade)

    var funcionario = Funcionario()
    funcionario.nome = pessoa.nome
    funcionario.altura = pessoa.altura
    funcionario.cargo = "Dev"
    funcionario.salario = 1450.0

    funcionario.exibirDados()

}