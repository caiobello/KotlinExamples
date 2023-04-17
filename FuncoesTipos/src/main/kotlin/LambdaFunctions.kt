fun main() {

    // All examples create a function object that performs upper-casing.
    // So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } //cria uma variável "upperCase1" que armazena uma função lambda que recebe uma String e retorna a sua versão em letras maiúsculas

    val upperCase2: (String) -> String = { str -> str.uppercase() } //cria uma variável "upperCase2" que armazena uma função lambda que recebe uma String e retorna a sua versão em letras maiúsculas, com tipo inferido

    val upperCase3 = { str: String -> str.uppercase() } //cria uma variável "upperCase3" que armazena uma função lambda que recebe uma String e retorna a sua versão em letras maiúsculas, com tipo inferido

// val upperCase4 = { str -> str.uppercase() } //cria uma variável "upperCase4" que tenta armazenar uma função lambda com tipo inferido, mas o tipo não pode ser inferido, então o código não compila

    val upperCase5: (String) -> String = { it.uppercase() } //cria uma variável "upperCase5" que armazena uma função lambda que recebe uma String e retorna a sua versão em letras maiúsculas, usando "it" para se referir ao único parâmetro da função

    val upperCase6: (String) -> String = String::uppercase //cria uma variável "upperCase6" que armazena uma referência para a função de extensão "uppercase" da classe String, que recebe uma String e retorna a sua versão em letras maiúsculas

    println(upperCase1("hello")) //chama a função armazenada em "upperCase1" passando a String "hello" como argumento e imprime o resultado na tela
    println(upperCase2("hello")) //chama a função armazenada em "upperCase2" passando a String "hello" como argumento e imprime o resultado na tela
    println(upperCase3("hello")) //chama a função armazenada em "upperCase3" passando a String "hello" como argumento e imprime o resultado na tela
    println(upperCase5("hello")) //chama a função armazenada em "upperCase5" passando a String "hello" como argumento e imprime o resultado na tela
    println(upperCase6("hello")) //chama a função armazenada em "upperCase6" passando a String "hello" como argumento e imprime o resultado na tela

}