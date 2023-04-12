class Animal(val name: String)                      // Define uma classe Animal com um atributo name

class Zoo(val animals: List<Animal>) {               // Define uma classe Zoo que possui uma lista de animais

    operator fun iterator(): Iterator<Animal> {       // 1. Sobrecarrega o operador "iterator" para retornar um iterador de Animal
        return animals.iterator()                     // 2. Retorna um iterador para a lista de animais
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))   // Cria um objeto Zoo com uma lista de animais

    for (animal in zoo) {                                   // 3. Itera sobre a lista de animais do objeto Zoo
        println("Watch out, it's a ${animal.name}")          // Imprime o nome do animal atual da iteração
    }

}
