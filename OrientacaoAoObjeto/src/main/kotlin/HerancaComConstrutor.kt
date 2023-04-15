// Definindo uma classe abstrata chamada "Tiger" com um construtor que aceita um parâmetro "origin" do tipo String
open class Tiger(val origin: String) {

    // Definindo um método "sayHello()" que imprime uma mensagem na tela usando a string "origin" da classe
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }

}

// Definindo uma classe chamada "SiberianTiger" que herda da classe abstrata "Tiger" e define a string "Siberia" como origem
class SiberianTiger : Tiger("Siberia")

// Função principal que instancia um objeto da classe "SiberianTiger" e chama o método "sayHello()"
fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}