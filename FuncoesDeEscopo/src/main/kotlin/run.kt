fun main() {

    fun getNullableLength(ns: String?) {      // define a função que recebe um argumento opcional de string
        println("for \"$ns\":")                // exibe o valor do argumento na tela

        ns?.run {                              // se o argumento não for nulo, aplica a função "run" no valor
            println("\tis empty? " + isEmpty()) // exibe se a string é vazia
            println("\tlength = $length")       // exibe o tamanho da string
            length                              // retorna o tamanho da string
        }
    }

    getNullableLength(null)                   // chamada da função com um argumento nulo
    getNullableLength("")                     // chamada da função com um argumento vazio
    getNullableLength("some string with Kotlin")  // chamada da função com uma string não vazia
}
