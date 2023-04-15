// define a classe Lion com duas propriedades: nome e origem
open class Lion(val name: String, val origin: String) {
    // define um método que imprime uma mensagem na tela, usando as propriedades definidas na classe
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// define uma classe Asiatic que herda da classe Lion e tem apenas um construtor que recebe o nome do leão
class Asiatic(name: String) : Lion(name = name, origin = "India")

// função principal
fun main() {
    // cria uma instância de Asiatic com nome "Rufo"
    val lion: Lion = Asiatic("Rufo")
    // chama o método sayHello da instância de Lion criada acima
    lion.sayHello()
}
