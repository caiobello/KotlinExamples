fun main() {

    for (c in 'a'..'d') {        // 1: percorre um intervalo de caracteres de 'a' até 'd', incluindo 'a' e 'd'.
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2: percorre um intervalo de caracteres de 'z' até 's', em decremento de 2 em 2.
        print(c)
    }
    print(" ")
    println()

    val x = 2
    if (x in 1..5) { // 1 - verifica se o valor de x está no intervalo de 1 a 5, inclusive
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) { // 2 - verifica se o valor de x NÃO está no intervalo de 6 a 10, inclusive
        print("x is not in range from 6 to 10")
    }

}
