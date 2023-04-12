fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // Define uma lista de números inteiros com valores positivos e negativos

    val anyNegative = numbers.any { it < 0 }             // Verifica se existe algum número negativo na lista "numbers"

    val anyGT6 = numbers.any { it > 6 }                  // Verifica se existe algum número maior que 6 na lista "numbers"

    println("Numbers: $numbers")                        // Imprime a lista "numbers" original
    println("Is there any number less than 0: $anyNegative")    // Imprime se existe algum número negativo na lista "numbers"
    println("Is there any number greater than 6: $anyGT6")       // Imprime se existe algum número maior que 6 na lista "numbers"

}