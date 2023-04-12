//Conjuntos (Sets) não aceita elementos duplicados

// Cria um conjunto mutável de strings chamado "openIssues" e inicializa com três elementos.
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

// Cria uma função que recebe uma string "uniqueDesc" e tenta adicionar ao conjunto "openIssues".
// Retorna true se a string foi adicionada com sucesso e false se ela já estiver presente no conjunto.
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc) // 2
}

// Cria uma função que recebe um booleano "isAdded" e retorna uma string com base em seu valor.
// Se "isAdded" for true, retorna "registered correctly", caso contrário, retorna "marked as duplicate and rejected".
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected." // 3
}

// Função principal que cria duas strings "aNewIssue" e "anIssueAlreadyIn".
// Em seguida, imprime uma mensagem formatada usando "aNewIssue" e "anIssueAlreadyIn" e o resultado da chamada da função "getStatusLog" para cada uma.
// A função "addIssue" é chamada com "aNewIssue" e "anIssueAlreadyIn" como argumentos.
// O resultado da função "addIssue" é passado para a função "getStatusLog" e o resultado é impresso na saída padrão.
// A primeira chamada da função "addIssue" adiciona uma nova string ao conjunto e retorna true, enquanto a segunda tenta adicionar uma string já presente e retorna false.
fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
}