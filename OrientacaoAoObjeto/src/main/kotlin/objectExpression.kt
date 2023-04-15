// A função rentPrice recebe três parâmetros do tipo Int que representam a quantidade de dias padrão, festivos e especiais
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {// É criado um objeto anônimo para armazenar as tarifas diárias de cada tipo de dia
    val dayRates = object {
        var standard: Int = 30 * standardDays // A tarifa padrão é de 30 dólares por dia, multiplicada pela quantidade de dias padrão
        var festivity: Int = 50 * festivityDays // A tarifa festiva é de 50 dólares por dia, multiplicada pela quantidade de dias festivos
        var special: Int = 100 * specialDays // A tarifa especial é de 100 dólares por dia, multiplicada pela quantidade de dias especiais
    }

// É calculado o total a pagar, somando as tarifas de cada tipo de dia
    val total = dayRates.standard + dayRates.festivity + dayRates.special

// É impresso o valor total, com o símbolo de dólar sendo escapado com a sequência de escape "$$"
    print("Total price: $$total")
}

// A função main é a função principal do programa, que apenas chama a função rentPrice passando valores de exemplo como argumentos
fun main() {
    rentPrice(10, 2, 1)
}