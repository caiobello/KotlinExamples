class Configuration(var host: String, var port: Int)  // declaração da classe Configuration com duas propriedades (host e port)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)  // instanciação da classe Configuration com valores específicos para suas propriedades

    with(configuration) {  // início do escopo da função with, passando configuration como argumento implícito
        println("$host:$port")  // acessa as propriedades host e port de configuration
    }

    //alternative
    configuration.run {  // início do escopo da função run, passando configuration como argumento implícito
        println("$host:$port")  // acessa as propriedades host e port de configuration
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")  // acessa as propriedades host e port diretamente de configuration
}
