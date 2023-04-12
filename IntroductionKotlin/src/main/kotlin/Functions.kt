/**printMessage é uma função que recebe uma string message como argumento e imprime essa mensagem na tela.*/
fun printMessage(message: String) {
    println(message)
}

/**printMessageWithPrefix é uma função que recebe duas strings como argumento,
 *  message e prefix (com um valor padrão de "Info" caso não seja fornecido um valor para prefix).
 *  A função concatena a string prefix com a string message,
 *  colocando colchetes em volta do prefix e imprime a mensagem na tela.
 *  */
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
/**sum é uma função que recebe dois números inteiros (x e y) e retorna a soma desses dois números.*/
fun sum(x: Int, y: Int): Int {
    return x + y
}

/**multiply é uma função que recebe dois números inteiros (x e y) e retorna o resultado da multiplicação desses dois números.*/
fun multiply(x: Int, y: Int) = x * y

/**Dentro da função main, as funções acima são chamadas e seus resultados são impressos na tela.*/
fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}