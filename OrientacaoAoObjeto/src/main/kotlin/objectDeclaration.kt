// Declaração de um objeto singleton chamado DoAuth
object DoAuth {
    // Definição de uma função takeParams que recebe como parâmetros um username e um password
    fun takeParams(username: String, password: String) {
// Imprime na tela uma mensagem com o valor das variáveis username e password
        println("input Auth parameters = $username:$password")
    }
}

// Função principal do programa
fun main(){
// Criação de um objeto DoAuth
// O objeto é criado automaticamente por ser singleton
    val auth = DoAuth
// Chamada da função takeParams do objeto DoAuth, passando os parâmetros "foo" e "qwerty"
    auth.takeParams("foo", "qwerty")
}