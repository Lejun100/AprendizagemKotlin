package Enumerador

fun main(args: Array<String>) {

    val tipoDaConta = TipoConta.SALARIO

    println(tipoDaConta.nomeConta)

}

enum class TipoConta(var nomeConta: String) {
    CORRENTE("Corrente"), POUPANCA("Poupança"), SALARIO("Salário")   //enumeradores sao listas de valores fixos
}