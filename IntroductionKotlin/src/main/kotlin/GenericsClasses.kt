/**declara a classe MutableStack que aceita um número variável de argumentos
 * do tipo E. O tipo E é um tipo genérico que será definido ao instanciar a classe. */
class MutableStack<E>(vararg items: E) {
    /**declara um atributo privado chamado "elements" que é uma lista mutável
     *  criada a partir dos argumentos do construtor.*/
    private val elements = items.toMutableList()
    /**define a função push que adiciona um novo elemento à pilha.*/
    fun push(element: E) = elements.add(element)
    /**define a função peek que retorna o último elemento da pilha, sem removê-lo.*/
    fun peek(): E = elements.last()
    /**define a função pop que remove e retorna o último elemento da pilha.*/
    fun pop(): E = elements.removeAt(elements.size - 1)
    /**define a função isEmpty que verifica se a pilha está vazia.*/
    fun isEmpty() = elements.isEmpty()
    /**define a função size que retorna o número de elementos na pilha.*/
    fun size() = elements.size
    /**define a função toString que retorna uma string representando a pilha,
     * convertendo seus elementos em uma única string separada por vírgulas e dentro de parênteses.*/
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

/**cria uma instância da classe MutableStack e adiciona alguns elementos a ela.*/
fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    /**adiciona um novo elemento à pilha usando a função push.*/
    stack.push(9.87)
    /**imprime a pilha usando a função println e a função toString.*/
    println(stack)
    /** imprime o último elemento da pilha sem removê-lo, usando a função peek.*/
    println("peek(): ${stack.peek()}")
    println(stack)
    /**Usam um loop for para remover e imprimir cada elemento da pilha usando a função pop.
     * A pilha é impressa após cada remoção.*/
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}