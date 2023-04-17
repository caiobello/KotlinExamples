fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int { //define uma função "calculate" que recebe dois inteiros e uma função que recebe dois inteiros e retorna um inteiro como argumentos e retorna um inteiro como resultado
    return operation(x, y) //chama a função "operation" passando os dois inteiros e retorna o resultado retornado pela função
}

fun sum(x: Int, y: Int) = x + y //define uma função "sum" que recebe dois inteiros e retorna a soma deles

fun main() {
    val sumResult = calculate(4, 5, ::sum) //chama a função "calculate" passando os inteiros 4 e 5 e a função "sum" como argumentos e armazena o resultado na variável "sumResult"
    val mulResult = calculate(4, 5) { a, b -> a * b } //chama a função "calculate" passando os inteiros 4 e 5 e uma função lambda que multiplica os dois inteiros como argumentos e armazena o resultado na variável "mulResult"
    println("sumResult $sumResult, mulResult $mulResult") //imprime as variáveis "sumResult" e "mulResult" na tela
}