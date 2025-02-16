package Classes.model

class Funcionario: Pessoa() {

    var cargo: String = ""
    var salario: Double = 0.0

    override fun exibirDados(){
        println("Nome: $nome")
        println("Data nascimento: $dataNascimento")
        println("Cargo: $cargo")
        println("Salario: $salario")
        println("Idade: ${calcularIdade()}")
    }

}