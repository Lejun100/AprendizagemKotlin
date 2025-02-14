package ArraysList

fun main(args: Array<String>) {

    var estados = arrayOf<String>("São Paulo", "Ceará", "Acre")

    if (estados.isEmpty()) {
        println("Os estados não estão listados")
    } else {
        println("Os estados foram listados")
    }

    println(estados[2])

    estados[2] = "Roraima"
    println(estados[2])

    var temEstado = estados.isEmpty()
    println(temEstado)   //estamos esperando um false pois tem estado, valores booleanos


    var valores = arrayOf<Int>()
    var temValor = valores.isEmpty()
    println(temValor)   //sai true pois esta vazio

    println(estados.size)
    println(valores.size)

    var alimentos = ArrayList<String>()

    alimentos.add("Macarrao")
    alimentos.add("Bolo")
    alimentos.add("bala")


    println("Alimentos: " + alimentos.size)

    println(alimentos.contains("Bolo"))  //saber se dentro do contais se encontra

    println(alimentos)  //lista de todos os componentes

    alimentos.removeAt(0)
    alimentos.remove("bala")
    println(alimentos)

    var filme = ArrayList<String>()
    filme.addAll(listOf(
        "Megamente",
        "Homem Aranha",
        "Gigantes de Aço"
    ))

    var filme2 = ArrayList<String>()  //list vazio
    filme.add("Eu sou a lenda")
    println(filme.count())  //4

    for (filmes in filme) {
        println(filme)
    }

    var filme3 = listOf(
        "Sim",
        "Vai"
    )

    var todos = filme + filme3
    println(todos)
}