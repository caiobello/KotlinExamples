fun <T> T?.nullSafeToString() = this?.toString() ?: "Ausencia de valor" //Esta é uma extensão de função genérica que adiciona um comportamento de segurança nula ao método toString(). Ela retorna uma string que representa o objeto caso ele não seja nulo, ou a string "Ausência de valor" caso contrário.

fun main() {
    println(null.nullSafeToString()) //Imprime "Ausência de valor" pois o objeto é nulo
    println("Kotlin".nullSafeToString()) //Imprime a string "Kotlin" pois o objeto não é nulo
}
