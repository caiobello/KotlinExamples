

fun main() {
    println(whenAssign("Hello"))                // Chamando a função 'whenAssign' com a string "Hello" como argumento e imprimindo o resultado
    println(whenAssign(3.4))                    // Chamando a função 'whenAssign' com o número 3.4 como argumento e imprimindo o resultado
    println(whenAssign(1))                      // Chamando a função 'whenAssign' com o número 1 como argumento e imprimindo o resultado
    println(whenAssign(MyClass()))              // Chamando a função 'whenAssign' com uma instância vazia da classe MyClass2 como argumento e imprimindo o resultado
    println(whenAssign(2))
}

//Estrutura Condicional
fun whenAssign(obj: Any): Any {                 // Definindo a função 'whenAssign' que aceita qualquer objeto como argumento e retorna qualquer objeto
    val result = when (obj) {                   // Começando uma estrutura de controle 'when' com o objeto 'obj' como argumento e atribuindo o resultado a uma variável chamada 'result'
        1 -> "one"                              // Se o objeto for igual a 1, atribui a string "one" à variável 'result'
        "Hello" -> 1                            // Se o objeto for igual a "Hello", atribui o número 1 à variável 'result'
        is Long -> false                        // Se o objeto for um longo, atribui 'false' à variável 'result'
        else -> 42                              // Caso contrário, atribui o número 42 à variável 'result'
    }
    return result                               // Retorna o valor atribuído à variável 'result'
}

class MyClass2                                   // Definindo uma classe vazia chamada 'MyClass2'
