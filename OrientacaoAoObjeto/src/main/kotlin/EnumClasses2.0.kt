enum class Color(val rgb: Int) { // Define uma enumeração "Color" com um parâmetro "rgb" do tipo Int
    RED(0xFF0000), // Define os valores de "rgb" para cada cor
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() =
        (this.rgb and 0xFF0000 != 0)  // Define uma função "containsRed" que verifica se o valor de "rgb" contém o componente vermelho
}

fun main() {
    val red = Color.RED // Define a cor vermelha
    println(red) // Imprime a cor vermelha
    println(red.containsRed()) // Verifica se a cor vermelha contém vermelho (deveria ser verdadeiro)
    println(Color.BLUE.containsRed()) // Verifica se a cor azul contém vermelho (deveria ser falso)
    println(Color.YELLOW.containsRed()) // Verifica se a cor amarela contém vermelho (deveria ser verdadeiro)
}




