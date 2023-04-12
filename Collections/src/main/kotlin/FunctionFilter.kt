fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1: Criação de uma lista de números inteiros.

    val positives = numbers.filter { x -> x > 0 }  // 2: Criação de uma nova lista contendo apenas os números positivos da lista 'numbers'.

    val negatives = numbers.filter { it < 0 }      // 3: Criação de uma nova lista contendo apenas os números negativos da lista 'numbers'.

    println("Numbers: $numbers")                   // 4: Imprime a lista original de números.
    println("Positive Numbers: $positives")        // 5: Imprime a lista de números positivos.
    println("Negative Numbers: $negatives")        // 6: Imprime a lista de números negativos.
}
