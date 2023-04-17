fun main() {

infix fun Int.times(str: String) = str.repeat(this)       //define uma função infix que repete a string passada como argumento a quantidade de vezes do número passado como argumento
println(7 times "he ")                                     //chama a função times para imprimir a string "he " repetida 7 vezes

val pair = "Ferrari" to "Katrina"                          //cria um Pair com a string "Ferrari" como primeiro elemento e "Katrina" como segundo elemento
println(pair)                                              //imprime o par criado acima

infix fun String.onto(other: String) = Pair(this, other)   //define uma função infix que cria um Pair com o primeiro argumento como primeiro elemento e o segundo como segundo elemento
val myPair = "McLaren" onto "Lucas"                         //chama a função onto para criar um Pair com "McLaren" e "Lucas"
println(myPair)                                            //imprime o par criado acima

val sophia = Person("Sophia")                              //cria um objeto Person com nome Sophia
val claudia = Person("Claudia")                            //cria um objeto Person com nome Claudia
sophia likes claudia                                       //chama a função infix likes para adicionar Claudia na lista de pessoas que Sophia gosta
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>() //cria uma lista mutável vazia para armazenar pessoas que essa pessoa gosta
    infix fun likes(other: Person) { likedPeople.add(other) } //define uma função infix que adiciona a pessoa passada como argumento na lista de pessoas que essa pessoa gosta
}






