fun main() {
    cases("Hello")      // Chamando a função 'cases' com a string "Hello" como argumento
    cases(1)            // Chamando a função 'cases' com o inteiro 1 como argumento
    cases(0L)           // Chamando a função 'cases' com o longo 0L como argumento
    cases(MyClass())    // Chamando a função 'cases' com uma instância da classe vazia MyClass como argumento
    cases("hello")      // Chamando a função 'cases' com a string "hello" como argumento
}

fun cases(obj: Any) {                                // Definindo a função 'cases' que aceita qualquer objeto como argumento
    when (obj) {                                     // Começando uma estrutura de controle 'when' com o objeto 'obj' como argumento
        1 -> println("One")                          // Se o objeto for igual a 1, imprime "One"
        "Hello" -> println("Greeting")               // Se o objeto for igual a "Hello", imprime "Greeting"
        is Long -> println("Long")                   // Se o objeto for um longo, imprime "Long"
        !is String -> println("Not a string")        // Se o objeto não for uma string, imprime "Not a string"
        else -> println("Unknown")                   // Caso contrário, imprime "Unknown"
    }
}

class MyClass                                          // Definindo uma classe vazia chamada 'MyClass'
