sealed class Mammal(val name: String)                   // Define uma classe selada "Mammal" com um parâmetro "name" do tipo String

class Cat(val catName: String) : Mammal(catName)         // Define uma subclasse "Cat" que herda da classe "Mammal" e tem um parâmetro "catName" do tipo String
class Human(val humanName: String, val job: String) : Mammal(humanName) // Define uma subclasse "Human" que herda da classe "Mammal" e tem parâmetros "humanName" e "job" do tipo String

fun greetMammal(mammal: Mammal): String {               // Define uma função "greetMammal" que recebe um objeto do tipo "Mammal" e retorna uma saudação em String
    when (mammal) {                                     // Verifica qual o tipo de "mammal" usando o operador "when"
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}" // Se "mammal" for do tipo "Human", retorna uma saudação com o nome e trabalho da pessoa
        is Cat -> return "Hello ${mammal.name}"         // Se "mammal" for do tipo "Cat", retorna uma saudação com o nome do gato
    } // Fecha o bloco "when"
}

fun main() {
    println(greetMammal(Cat("Snowy")))          // Chama a função "greetMammal" com um objeto "Cat" e imprime a saudação resultante
    println(greetMammal(Human("Caio Bello", "Desenvolvedor Full Stack")))
}




