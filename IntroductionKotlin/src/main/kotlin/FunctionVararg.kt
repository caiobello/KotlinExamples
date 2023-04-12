/**Este é um código em Kotlin que define três funções aninhadas dentro da função main().*/
fun main() {
    /**printAll é uma função que recebe um número variável de argumentos de string (usando vararg), itera sobre cada mensagem e a imprime na tela.*/
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好", "Oi")                 // 2

    /**printAllWithPrefix é uma função que recebe um número variável de argumentos de string (usando vararg)
     *  e um argumento de string prefix, que é adicionado a cada mensagem antes de ser impressa na tela.*/
    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    /**A função printAllWithPrefix é chamada e passa as mesmas mensagens de antes e um argumento de prefixo "Greeting:".*/
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")

}