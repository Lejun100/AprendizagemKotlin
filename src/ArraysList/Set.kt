package ArraysList

fun main(args: Array<String>) {

    var filmes = HashSet<String>()
    println(filmes.size)

    filmes.add("Hobbit")
    filmes.add("Sonic")

    println(filmes.size)
    println(filmes.contains("Hobbit"))
    println(filmes)

    filmes.add("Sonic 2")
    println(filmes)

    var numeros = setOf(17.9, 21.9, 39.4)
    println(numeros)

    var produtos = HashMap<String, Double>()
    produtos.put("Mouse", 85.0)
    produtos.put("Fone", 115.0)
    produtos.put("Aparelho", 270.9)
    produtos.put("Camera", 899.9)
    println(produtos)

    produtos.remove("Mouse")
    println(produtos)

    println(produtos.get("Fone"))

}