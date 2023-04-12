// Define a constante "POINTS_X_PASS" como um inteiro com valor 15
const val POINTS_X_PASS: Int = 15

// Cria um mapa mutável de Inteiros para Inteiros chamado "EZPassAccounts" com valores iniciais (chave, valor) de (1, 100), (2, 100), e (3, 100)
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

// Cria um mapa imutável de Inteiros para Inteiros chamado "EZPassReport" que aponta para o mesmo objeto que o mapa mutável "EZPassAccounts"
val EZPassReport: Map<Int, Int> = EZPassAccounts

// Define uma função "updatePointsCredit" que recebe um "accountId" como um inteiro e
// atualiza a quantidade de créditos correspondente no mapa "EZPassAccounts"
fun updatePointsCredit(accountId: Int) {
// Verifica se "accountId" está no mapa "EZPassAccounts"
    if (EZPassAccounts.containsKey(accountId)) {
// Se estiver, imprime uma mensagem indicando que o ID está sendo atualizado
        println("Updating $accountId...")
// Atualiza o valor correspondente no mapa "EZPassAccounts" adicionando a constante "POINTS_X_PASS"
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
// Se não estiver, imprime uma mensagem de erro indicando que a conta não existe
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

// Define uma função "accountsReport" que imprime um relatório dos créditos do "EZPassReport"
fun accountsReport() {
// Imprime uma mensagem indicando que um relatório do EZ-Pass está sendo gerado
    println("EZ-Pass report:")
// Percorre todos os pares (chave, valor) no mapa "EZPassReport" e imprime o ID e o crédito correspondente
    EZPassReport.forEach { k, v -> println("ID $k: credit $v") }
}

// Função principal do programa
fun main() {
// Imprime um relatório das contas existentes (todos têm 100 créditos iniciais)
    accountsReport()
// Atualiza a quantidade de créditos para a conta com ID 1
    updatePointsCredit(1)
// Atualiza a quantidade de créditos para a conta com ID 1 novamente
    updatePointsCredit(1)
// Tenta atualizar a quantidade de créditos para uma conta que não existe (ID 5)
    updatePointsCredit(5)
// Imprime um relatório atualizado das contas, mostrando que as contas 1 e 2 têm créditos adicionais, mas a conta 5 não existe
    accountsReport()
}