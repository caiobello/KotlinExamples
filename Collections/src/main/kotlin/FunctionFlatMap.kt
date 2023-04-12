fun main() {


    val fruitsBag = listOf("apple","orange","banana","grapes")  // Define uma lista de frutas
    val clothesBag = listOf("shirts","pants","jeans")           // Define uma lista de roupas
    val cart = listOf(fruitsBag, clothesBag)                    // Cria uma lista aninhada com as listas de frutas e roupas
    val mapBag = cart.map { it }                                // Cria uma nova lista "mapBag" com os elementos da lista "cart"
    val flatMapBag = cart.flatMap { it }                        // Cria uma nova lista "flatMapBag" a partir da lista aninhada "cart"


    println("Your bags are: $mapBag")                           // Imprime a lista aninhada "cart"
    println("The things you bought are: $flatMapBag")           // Imprime a lista achatada "flatMapBag"

}