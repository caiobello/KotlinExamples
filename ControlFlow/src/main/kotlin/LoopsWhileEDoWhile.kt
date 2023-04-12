fun eatACake() = println("Eat a Cake")     // define uma função que imprime "Eat a Cake"
fun bakeACake() = println("Bake a Cake")   // define uma função que imprime "Bake a Cake"

fun main(args: Array<String>) {            // define a função principal

    var cakesEaten = 0                     // declara e inicializa uma variável
    var cakesBaked = 0                     // declara e inicializa outra variável

    while (cakesEaten < 4) {               // executa enquanto a condição for verdadeira
        eatACake()                         // chama a função eatACake
        cakesEaten ++                      // incrementa a variável de bolos comidos
    }

    do {                                   // executa pelo menos uma vez
        bakeACake()                        // chama a função bakeACake
        cakesBaked++                       // incrementa a variável de bolos assados
    } while (cakesBaked < cakesEaten)      // executa enquanto a condição for verdadeira
}
