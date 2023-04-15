import java.util.Random                  // Importa a classe Random

class LuckDispatcher {                   // Declaração de uma classe chamada LuckDispatcher
    fun getNumber() {                    // Declaração de uma função pública chamada getNumber sem parâmetros
        var objRandom = Random()         // Cria uma instância da classe Random e a atribui a objRandom
        println(objRandom.nextInt(90))   // Imprime um número aleatório gerado pelo objeto objRandom entre 0 e 89
    }
}

fun main() {                              // Função principal do programa
    val d1 = LuckDispatcher()             // Cria uma instância da classe LuckDispatcher e atribui a d1
    val d2 = LuckDispatcher()             // Cria uma segunda instância da classe LuckDispatcher e atribui a d2

    d1.getNumber()                        // Chama a função getNumber na instância d1 da classe LuckDispatcher
    d2.getNumber()                        // Chama a função getNumber na instância d2 da classe LuckDispatcher
}