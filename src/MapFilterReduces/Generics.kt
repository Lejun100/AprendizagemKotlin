package MapFilterReduces

fun main() {

    //Função para trocar números inteiros
    fun swapInt(num1: Int, num2: Int): Pair<Int, Int> {
        return Pair(num2, num1)
    }
    //Função para trocar String
    fun swapString(string1: String, string2: String): Pair<String, String> {
        return Pair(string2, string1)
    }

    //Resultado
    println(swapInt(4,400))
    //println(swapInt("TEST1", "TEST2")) //ERRO
    println(swapString("TEST1","TEST2"))
    //Função para trocar qualquer elemento
    fun<T>swapAnything(element1: T, element2: T): Pair<T, T> {
        return Pair(element2, element1)
    }


    println(swapAnything(4, 400)) //(400, 4)
    println(swapAnything("Test1", "Test2")) //(Test2, Test1)
    println(swapAnything(20.5, 32.5)) // (32.5, 20.5)


}