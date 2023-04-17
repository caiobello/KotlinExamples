fun main() {

    operator fun Int.times(str: String) = str.repeat(this)        //define a sobrecarga do operador * para que um inteiro multiplique uma string, repetindo a string a quantidade de vezes do inteiro
    println(3 * "Ha  ")                                          //chama a função sobrecarregada do operador * para imprimir a string "Ha  " repetida 3 vezes

    operator fun String.get(range: IntRange) = substring(range)  //define a sobrecarga do operador [] para que a string retorne a substring correspondente ao intervalo passado como argumento
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..17])                                          //chama a função sobrecarregada do operador [] para imprimir a substring correspondente aos índices 0 a 17 da string "str"

}