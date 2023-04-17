//bastante utilizada

fun customPrint(s: String) {  // Função que recebe uma String como parâmetro e imprime ela em caixa alta
    print(s.uppercase())
}
fun main() {
    val empty = "test".let { // Utiliza a função let para executar um bloco de código em "test"
        customPrint(it)   // Chama a função customPrint para imprimir "test" em caixa alta
        it.isEmpty()     // Verifica se "test" está vazio e armazena o resultado em empty
    }
    println(" is empty: $empty")     // Imprime a mensagem " is empty: " e o valor de empty

    fun printNonNull(str: String?) { // Função que recebe uma String opcional e imprime ela em caixa alta se ela não for nula
        println("Printing \"$str\":") // Imprime a mensagem "Printing \"[valor da String]\":"

        str?.let {           // Verifica se a String não é nula
            print("\t")             // Se não for, imprime um tab
            customPrint(it)         // E chama a função customPrint para imprimir a String em caixa alta
            println()               // Pula uma linha
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {  // Função que recebe duas Strings opcionais e imprime ambas em caixa alta se não forem nulas
        strOne?.let { firstString ->            // Verifica se a primeira String não é nula
            strTwo?.let { secondString ->       // Verifica se a segunda String não é nula
                customPrint("$firstString : $secondString") // Se nenhuma for nula, chama a função customPrint para imprimir as Strings em caixa alta, separadas por ":"
                println()                       // Pula uma linha
            }
        }
    }

    printNonNull(null)  // Chama a função printNonNull passando null como parâmetro, que não imprime nada
    printNonNull("My String test")  // Chama a função printNonNull passando "My String test" como parâmetro, que imprime a String em caixa alta

    printIfBothNonNull("First","Second")  // Chama a função printIfBothNonNull passando "First" e "Second" como parâmetros, que imprime as Strings em caixa alta separadas por ":"
}
