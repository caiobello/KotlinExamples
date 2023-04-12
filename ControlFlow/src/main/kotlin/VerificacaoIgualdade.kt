// == igualdade e === identidade

// Função principal que executa o programa.
fun main() {
// Criação de dois conjuntos (sets) de autores e escritores.
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
// Comparação se os conjuntos possuem os mesmos elementos (true).
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

// Imprime o resultado da comparação de igualdade entre os conjuntos (true).
    println(authors == writers) // 1

// Imprime o resultado da comparação de identidade entre os conjuntos (false).
    println(authors === writers) // 2
}