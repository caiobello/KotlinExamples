class BigBen {                               // Classe BigBen
    companion object Bonger {                  // Declara um objeto companheiro BigBen.Bonger
        fun getBongs(nTimes: Int) {             // Declara uma função getBongs
            for (i in 1 .. nTimes) {        // Loop para imprimir BONG várias vezes
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)                // Chama a função getBongs com um objeto BigBen
}
