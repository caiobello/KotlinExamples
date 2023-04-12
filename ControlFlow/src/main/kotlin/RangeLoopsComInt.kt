fun main() {

    for(i in 0..3) {             // 1 - loop de 0 a 3, inclusivo
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2 - loop de 0 a 2, exclusivo
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3 - loop de 2 a 8 em incrementos de 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4 - loop de 3 a 0, decrescendo
        print(i)
    }
    print(" ")


}
