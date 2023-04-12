// Cria uma lista mutável de Inteiros chamada "systemUsers" e inicializa com 1, 2 e 3.
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

// Cria uma lista imutável de Inteiros chamada "sudoers" e atribui a mesma lista de "systemUsers".
val sudoers: List<Int> = systemUsers

// Cria uma função que adiciona um novo usuário ao final da lista "systemUsers".
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

// Cria uma função que retorna a lista imutável "sudoers".
fun getSysSudoers(): List<Int> {
    return sudoers
}

// Função principal que adiciona um novo usuário com valor 4 à lista "systemUsers".
// Em seguida, imprime o tamanho da lista "sudoers" usando uma string formatada.
// Por fim, imprime informações úteis para cada elemento da lista "sudoers" usando forEach.
// Nota: "sudoers" e "systemUsers" referem-se à mesma lista, pois "sudoers" é apenas uma referência à lista "systemUsers".
fun main() {
    addSystemUser(777)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
// A tentativa de adicionar um novo usuário diretamente à lista "sudoers" é um erro,
// pois "sudoers" é uma lista imutável e não pode ser modificada.
// Portanto, essa linha está comentada.
// getSysSudoers().add(5) <- Error!
}