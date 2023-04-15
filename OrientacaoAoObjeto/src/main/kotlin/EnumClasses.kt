enum class State {
    IDLE, RUNNING, FINISHED // Define uma enumeração "State" com três estados possíveis: IDLE, RUNNING e FINISHED
}

fun main() {
    val state = State.RUNNING // Define o estado "state" como RUNNING
    val message = when (state) { // Avalia o estado "state" com a estrutura "when"
        State.IDLE -> "It's idle" // Caso o estado seja IDLE, a mensagem é "It's idle"
        State.RUNNING -> "It'sc running" // Caso o estado seja RUNNING, a mensagem é "It's running"
        State.FINISHED -> "It's finished" // Caso o estado seja FINISHED, a mensagem é "It's finished"
    }
    println(message) // Imprime a mensagem correspondente ao estado "state"


}