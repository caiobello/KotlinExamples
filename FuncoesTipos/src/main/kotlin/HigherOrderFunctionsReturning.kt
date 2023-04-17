fun operation(): (Int) -> Int { //define uma função "operation" que retorna uma função que recebe um inteiro e retorna um inteiro
    return ::square //retorna a função "square"
}

fun square(x: Int) = x * x //define uma função "square" que recebe um inteiro e retorna o seu quadrado

fun main() {
    val func = operation() //chama a função "operation" e armazena a função retornada na variável "func"
    println(func(3)) //chama a função armazenada na variável "func" passando o inteiro 3 como argumento e imprime o resultado na tela
}