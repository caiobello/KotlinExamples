//var é mutavel (podem ser alteradas)
//val é imutavel (não podem ser alteradas)

fun main() {
    var a: String = "initial"  // 1
    println(a)
    a = "final"
    println(a)

    val b: Int = 1             // 2
    println(b)
    val c = 3                  // 3
    println(c)

    fun someCondition() = false
        val d: String  // 1
        if (someCondition()) {
            d = "True"   // 2
        } else {
            d = "False"   // 2
        }
        println(d) // 3


}