fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)     // Define uma lista de números inteiros com valores positivos e negativos

    val doubled = numbers.map { x -> x * 2 }      // Cria uma nova lista "doubled" com os números da lista "numbers" multiplicados por 2

    val tripled = numbers.map { it * 3 }          // Cria uma nova lista "tripled" com os números da lista "numbers" multiplicados por 3

    println("Numbers: $numbers")                 // Imprime a lista "numbers" original
    println("Doubled Numbers: $doubled")          // Imprime a lista "doubled" com os números multiplicados por 2
    println("Tripled Numbers: $tripled")          // Imprime a lista "tripled" com os números multiplicados por 3

}