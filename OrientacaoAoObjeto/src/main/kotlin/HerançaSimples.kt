open class Dog { // Define a classe Dog com a palavra-chave 'open', permitindo que ela seja herdada
    open fun sayHello() { // Define a função sayHello() com a palavra-chave 'open', permitindo que ela seja sobrescrita
        println("wow wow!") // Imprime a string "wow wow!"
    }
}

class Yorkshire : Dog() { // Define a classe Yorkshire que herda da classe Dog
    override fun sayHello() { // Sobrescreve a função sayHello() com a palavra-chave 'override'
        println("wif wif!") // Imprime a string "wif wif!"
    }
}

fun main() {
    val dog: Dog = Yorkshire() // Cria uma nova instância da classe Yorkshire e armazena na variável dog, que é do tipo Dog
    dog.sayHello() // Chama a função sayHello() da classe Yorkshire, que imprime a string "wif wif!"
    dog.sayHello() // Chama novamente a função sayHello() da classe Yorkshire, que imprime novamente a string "wif wif!"
    dog.sayHello() // Chama mais uma vez a função sayHello() da classe Yorkshire, que imprime mais uma vez a string "wif wif!"
}