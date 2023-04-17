data class Person(var name: String, var age: Int, var about: String) { // Declaração de uma data class chamada Person que contém três propriedades: name (String), age (Int) e about (String)
    constructor() : this("", 0, "") // Declaração de um construtor secundário que chama o construtor primário passando valores padrão para as propriedades
}

fun main() {
    val caio =
        Person() // Criação de uma nova instância de Person usando o construtor secundário padrão que não recebe nenhum argumento
//println(caio)
    val stringDescription =
        caio.apply { // Chama o método apply na instância caio de Person e usa uma expressão lambda para atualizar as propriedades name, age e about com novos valores
            name = "Caio Bello"
            age = 30
            about = "Back End developer"
        }.toString() // Retorna a instância caio atualizada como uma String usando o método toString()
    println(caio) // Imprime a instância caio de Person (os valores atualizados devem ser mostrados)
    println(caio.toString()) // Imprime a instância caio de Person como uma String (os valores atualizados devem ser mostrados)
    println(stringDescription) // Imprime a instância caio atualizada como uma String (os valores atualizados devem ser mostrados)
}