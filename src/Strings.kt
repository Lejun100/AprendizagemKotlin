fun main(args: Array<String>) {

    var nome = "Jun"

    println(nome.length)

    var cidade: String = "São Paulo"

    println("Nome da cidade: " + cidade)

    var tipo = 'X'
    println(tipo)

    tipo = 'o'

    var (codigo, descricao) = Pair(100, "Mouse")
    println(codigo)
    println(descricao)

    var produto2: Pair<Int, String> = Pair(150, "Fone")
    println(produto2.second)
    println(produto2.first)

    val nomeEstudante = "Leandro Jun"
    val resultado = "aprovado"
    val notaEstudante = 8.7

    println("O estudante: $nomeEstudante teve como nota: $notaEstudante e resultado: $resultado")

    //booleanos
    var aprovado = true
    var teste: Boolean = false

    




}