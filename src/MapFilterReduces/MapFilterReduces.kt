package MapFilterReduces

fun main(args: Array<String>) {

    var num = listOf(1, 2, 3, 4, 5)

    var pares = num.filter {
        it % 2 == 0
    }

    println(pares)

    var food = listOf("Uva", "Morango", "Manga", "Maracuja", "Abacaxi")

    var foodM = food.filter {
        it.contains("u")
    }

    println(foodM)

    println("***** utilizando o Map *****")

    var frutasMaiores = food.map {
        it.uppercase()
    }

    println(frutasMaiores)

    var soma = num.reduce { atual, prox -> atual + prox}  //valor da soma ficara guardadada no atual
    //outro exemplo importante de se usar o reduce é em contas bancarias, como por exemplo sacar o dinheiro
    //e saber quanto que fica o saldo menos o saque gerando o valor final dessa subtração
    println(soma)

    //reduce
    /*fun main(args: Array<String>) {

        //Utilizando Reduce
        var transactions = arrayOf<Double>
        (500.0, -45.0, -70.0, -25.80, -321.72, 190.0, -35.15, -100.0)

        var balance = transactions.reduce {

                acc,it -> println("Saldo: " + String.format("%.2f", acc) +
                " => Próximo Lançamento: " + String.format("%.2f", it))
            (acc + it)
        }

        println("Seu saldo é R$ " + String.format("%.2f", balance))
        //Seu saldo é R$ 92,33*/

    }


