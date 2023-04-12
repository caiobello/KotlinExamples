fun main(args: Array<String>) {

    val cakes = listOf("carrot", "cheese", "chocolate")  // Criando uma lista de strings chamada 'cakes' com os valores "carrot", "cheese" e "chocolate"

    for (cake in cakes) {                               // Começando um loop 'for' para cada elemento na lista 'cakes', atribuindo cada elemento à variável 'cake'
        println("Yummy, it's a $cake cake!")            // Imprimindo uma string com o valor de 'cake' interpolado na posição '$cake'
    }

}
