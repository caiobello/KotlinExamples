data class Person2(var name: String, var age: Int, var about: String) {  // declaração da classe Person2 com três propriedades (name, age, about)
    constructor() : this("", 0, "")  // construtor secundário da classe que inicializa as propriedades com valores padrão
}

fun writeCreationLog(p: Person2) {  // função que recebe um objeto da classe Person2 como parâmetro
    println("A new person ${p.name} was created.")  // exibe uma mensagem indicando que uma nova pessoa foi criada e o nome da pessoa passado como parâmetro
}

fun main() {

    val jake = Person2("Jake", 30, "Android developer")  // cria um objeto da classe Person2 com os valores iniciais passados como parâmetros
        .also {  // chama a função "also" para executar uma ação extra com o objeto criado
            writeCreationLog(it)  // passa o objeto criado como parâmetro para a função writeCreationLog, que exibe uma mensagem indicando que uma nova pessoa foi criada e o nome da pessoa
        }

}
